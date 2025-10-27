//HIII! This is my guessing game, try to guess the best you can and beat those people with your guesses :)

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>



typedef struct
{
	char first_name[30];
	int guess;
} person;

void addLeaders(person p);

#define FILEE "leaders.txt"
person leaderBoard[5];
int GUESS__;
int leaderCount = 0;

typedef enum {F = 0,T = 1} Bool;

int GetGuess()
{

	scanf(" %d", &GUESS__);
	return GUESS__;

}
void PlayGuessingGame()
{

	person p1;
	printf("Please enter your name to start:\n");
	scanf("%s", p1.first_name);


	srand((unsigned int)time(NULL));
	int numberToGuess = rand() % 91 + 10;
	double squareRoot = sqrt(numberToGuess);

	printf("%.8f is the square root of what number?\nPlease guess a value between 10 and 100: ", squareRoot);



	p1.guess =0;

	Bool done = F;
	while (!done)
	{

		int input = GetGuess();



		if (input < numberToGuess)
		{
			printf("Too low, guess again: ");
			p1.guess++;


		}

		else if (input > numberToGuess)
		{
			printf("Too high, guess again: ");
			p1.guess++;

		}
		else
		{

			p1.guess++;
			printf("YAYY! You got it, baby!\n");
			printf("You made %d guesess. \n", p1.guess);

			 addLeaders(p1);

			 printf("Here are the current leaders:\n");
			 for (int i = 0; i < leaderCount; i++) {
			     printf("%s made %d guesses\n", leaderBoard[i].first_name, leaderBoard[i].guess);
			 }
			done = T;

		}





	}

}


void addLeaders(person p) {

	int lame_guess =0;

	if (leaderCount < 5) {
	        leaderBoard[leaderCount++] = p;
	    }
	else {
	        if (p.guess < leaderBoard[leaderCount-1].guess) {
	            leaderBoard[leaderCount-1] = p;
	        }
	    }

	for (int i = 0; i < leaderCount - 1; i++) {
	        for (int j = i + 1; j < leaderCount; j++) {
	            if (leaderBoard[j].guess < leaderBoard[i].guess) {
	                person temp = leaderBoard[i];
	                leaderBoard[i] = leaderBoard[j];
	                leaderBoard[j] = temp;
	            }
	        }
	}

}


void printLeaders()
{

	    for (int i = 0; i < leaderCount; i++) {
	        printf("%s had the %d guesses of\n", leaderBoard[i].first_name, leaderBoard[i].guess);
	    }

}

void SaveLeaders() {
    FILE *fp = fopen(FILEE, "w");

    if( fp == NULL )
    {
    fprintf( stderr, "Cannot open %s.\n", FILEE );
    exit(1);
    }

    for (int x = 0; x < leaderCount; x++) {
        fprintf(fp, "%s %d\n", leaderBoard[x].first_name, leaderBoard[x].guess);
    }


    fclose(fp);
}


void leadersFromFile() {
    FILE *fp = fopen(FILEE, "r");
    if (fp == NULL)
    {
    	return;

    }

    leaderCount = 0;
    while (leaderCount < 5 && fscanf(fp, "%s %d", leaderBoard[leaderCount].first_name, &leaderBoard[leaderCount].guess) == 2)
    {
        leaderCount++;
    }

    fclose(fp);
}

int main()
{

	leadersFromFile();

	printf("HII Welcome! Press 'q' to quit or any other key to continue: \n");

	char input=0;
	char game_over=0;

	while(game_over == 0)
	{
		scanf(" %c", &input);

		if(input == 'q')
			{
				SaveLeaders();
				game_over = 1;
				printf("Bye Bye!\n");
			}
		else{


			PlayGuessingGame();
			printf("Press 'q' to quit or any other key to continue:\n");
			}
	}
	return 0;
}


