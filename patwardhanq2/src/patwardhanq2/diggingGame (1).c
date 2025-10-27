//Hi! This is my code for the treasure map game! Enjoy and hopefully you win the game :)
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define SIZE 5
#define MAX 7

char grid[SIZE][SIZE];

void printTheGrid() {
    for (int x = 0; x < SIZE; x++) {
        for (int y = 0; y < SIZE; y++) {
            printf("%c", grid[x][y]);
        }
        printf("\n");
    }
}

void playerMoveStart(int treasureRow, int treasureCol) {
    int guess;
    char direction;
    int currentRow = 0;
    int currentCol = 0;
    int tries = MAX;
    char playerStart = 'v';

    printf("Choose where you want to start. Input a number between 0 and 4: ");
    scanf("%d", &guess);

    currentCol = guess;
    grid[currentRow][currentCol] = playerStart;

    printTheGrid();

    while (tries > 0) {
        printf("Choose which direction you want to dig. Remember d = down, l = left, r = right: ");
        scanf(" %c", &direction);

        grid[currentRow][currentCol] = ' ';

        if (direction == 'd')
        {

            if (currentRow < SIZE - 1) {
            	currentRow++;
            }
        }
        else if (direction == 'l')
        {
            if (currentCol > 0){
            	currentCol--;
            }
        }
        else if (direction == 'r')
        {
            if (currentCol < SIZE - 1)
            	{
            	currentCol++;
            	}
        }
        else {
            printf("That is an invalid move, try again\n");
        }


        grid[currentRow][currentCol] = 'v';
        printTheGrid();

        if (currentRow == treasureRow && currentCol == treasureCol) {
            printf("wow! you found the treasure!\n");
            return;
        }

        tries--;
        printf("Tries left: %d\n", tries);
    }

    printf("You ran out of tries! The treasure was at (%d,%d)\n", treasureRow, treasureCol);
}

int main() {

	srand(time(0));

    // pick random treasure location (not top row)
    int treasureRow = rand() % (SIZE - 1) + 1;
    int treasureCol = rand() % SIZE;

    printf("Ahoy matey! Are ye ready to dig for treasure? Press 'q' to quit or any other key to continue:\n");
    char c;
    scanf(" %c", &c);

    if (c != 'q') {
        printf("Here is the dig site:\n");
        printf("01234\n");
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                grid[x][y] = '0';
                printf("%c", grid[x][y]);
            }
            printf("\n");
        }

        // start game
        playerMoveStart(treasureRow, treasureCol);
    } else {
        printf("Godspeed!\n");
    }

    return 0;
}

