
#ifndef SLIST_H
#define SLIST_H

#include <stdio.h>


struct node {
    char* data;
    struct node* next;
};


struct singlylinkedlist {
    struct node* head;
    struct node* tail;
};

typedef struct singlylinkedlist slist;
typedef slist Deque;

void insertHead(slist* list, char* data);
char* removeHead(slist* list);
void insertTail(slist* list, char* data);
char* removeTail(slist* list);

#endif /* SLIST_H */
