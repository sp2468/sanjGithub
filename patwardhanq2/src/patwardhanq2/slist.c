#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "slist.h"

void insertHead(slist* list, char* data) {

    struct node* newnode = malloc(sizeof(struct node));
    newnode->data = data;
    newnode->next = list->head;

    list->head = newnode;

    if (list->tail == NULL)
        list->tail = newnode;
}

char* removeHead(slist* list) {
    if (list->head == NULL)
        return NULL;

    struct node* temp = list->head;
    char* data = temp->data;
    list->head = list->head->next;

    if (list->head == NULL)
        list->tail = NULL;
    free(temp);
    return data;
}


void insertTail(slist* list, char* data) {

    struct node* newnode = malloc(sizeof(struct node));
    newnode->data = data;
    newnode->next = NULL;
    if (list->tail)
        list->tail->next = newnode;
    else
        list->head = newnode;
    list->tail = newnode;
}

char* removeTail(slist* list) {

    if (list->head == NULL)
        return NULL;

    struct node* prev = NULL;

    struct node* curr = list->head;

    while (curr->next != NULL) {
        prev = curr;
        curr = curr->next;
    }

    char* data = curr->data;
    if (prev)
        prev->next = NULL;
    else
        list->head = NULL;


    list->tail = prev;
    free(curr);
    return data;

}
