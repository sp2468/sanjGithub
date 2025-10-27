#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "bst.h"

struct node* create_game_tree() {
    struct node* root = NULL;
    root = insert(root, 100, "Does it grow underground?", "");
    insert(root, 50, "Is it long in shape?", "");
    insert(root, 25, "Is it orange in color?", "");
    insert(root, 15, "", "It's a carrot!");
    insert(root, 35, "", "It's a parsnip!");
    insert(root, 75, "Is it red in color?", "");
    insert(root, 65, "", "It's a radish!");
    insert(root, 85, "", "It's a potato!");
    insert(root, 150, "Does it grow on a tree?", "");
    insert(root, 125, "Is it red in color?", "");
    insert(root, 115, "", "It's an apple!");
    insert(root, 135, "", "It's a peach!");
    insert(root, 175, "Is it red in color?", "");
    insert(root, 165, "", "It's a tomato!");
    insert(root, 185, "", "It's a pea!");
    return root;
}

void play_game(struct node* root) {
    struct node* current = root;
    char answer;

    printf("You think of a fruit or vegetable and I will try to guess it!\n");

    while (current != NULL) {
        if (strlen(current->question) > 0) {


            printf("%s\n", current->question);
            printf("y/n: ");


            scanf(" %c", &answer);
            if (answer == 'y')
                current = current->left;
            else
                current = current->right;
        } else
        {
            printf("%s\n", current->guess);
            printf("y/n: ");
            scanf(" %c", &answer);

            if (answer == 'y')
                printf("I win!\n");
            else
                printf("You win!\n");
            break;
        }
    }
}

int main() {
    struct node* tree_ = create_game_tree();
    char c;

    printf("Welcome! Press 'q' to quit or any other key to continue:\n");
    while (1) {
        scanf(" %c", &c);
        if (c == 'q') {
            printf("Bye Bye!\n");
            break;
        }
        play_game(tree_);

        printf("Press 'q' to quit or any other key to continue:\n");
    }
    return 0;
}
