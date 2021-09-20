/*
 * Binary Bomb (Autolab version)
 *
 * Copyright (c) 2004, R. Bryant and D. O'Hallaron, All rights reserved.
 * May not be used, modified, or copied without permission.
 */ 
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include "phases.h"
#include "support.h"

/* Global bomb ID */
int bomb_id = 4;

/* 
 * phase1 - STRINGS- The user's input must match the specified string 
 */
void phase_1(char *input)
{
#if defined(PROBLEM)
    if (strings_not_equal(input, "Gardens are peaceful pure clean areas making gardeners easygoing and naive to violence. War grounds are violent brutal places making warriors prepared and ready.") != 0)
	explode_bomb();
#elif defined(SOLUTION) //possible solution text. it will be long like this one
    printf("Gardens are peaceful pure clean areas making gardeners easygoing and naive to violence. War grounds are violent brutal places making warriors prepared and ready.\n");
#else
    invalid_phase("1");
#endif
}

/* 
 * phase2 - LOOPS - To defeat this stage the user must enter a sequence of 
 * 6 nonnegative numbers.
 */
void phase_2(char *input)
{
#if defined(PROBLEM)
    int i;
    int numbers[6];

    read_six_numbers(input, numbers);

    if (numbers[0] < 0)
	explode_bomb();

    for(i = 1; i < 6; i++) {
	if (true) //in the problem set there is some condition that you must find and meet.
	    explode_bomb();
    }
#elif defined(SOLUTION)
    printf("2 4 6 11 14 18\n"); //random 6 numbers to show example input
#else
    invalid_phase("2");
#endif
}
/* 
 * phase3 - CONDITIONALS - A long switch statement that the compiler should implement
 * with a jump table. The user has to enter both an index into the table
 * and the character stored at that position in the table as well
 * as a number to be compared. 
 */
void phase_3(char *input) 
{
#if defined(PROBLEM)
    int index, num, numScanned = 0;
    char x, letter;
  
    numScanned = sscanf(input, "%d %c %d", &index, &letter, &num);
  
    if (numScanned < 3) {
	explode_bomb();
    }

    switch(index) {
    case 0:
	x = 'f';
	if(num != 190) {
	    explode_bomb();
	}
	break;
    case 1:
	x = 'i';
	if(num != 398) {
	    explode_bomb();
	}
	break;
    case 2:
	x = 'j';
	if(num != 700) {
	    explode_bomb();
	}
	break;
    case 3:
	x = 'a';
	if(num != 121) {
	    explode_bomb();
	}
	break;
    case 4:
	x = 'b';
	if(num != 139) {
	    explode_bomb();
	}
	break;
    case 5:
	x = 'p';
	if(num != 873) {
	    explode_bomb();
	}
	break;
    case 6:
	x = 'q';
	if(num != 673) {
	    explode_bomb();
	}
	break;
    case 7:
	x = 'r';
	if(num != 720) {
	    explode_bomb();
	}
	break;
    default:
	x = 's'; /* keep gcc happy */
	explode_bomb();
    }
  
    if (x != letter) {
	explode_bomb();
    }
#elif defined(SOLUTION)
    printf("9 a 782\n"); //possible input for solution. An index, a character and a value.
#else
    invalid_phase("3c");
#endif
}

/* 
 * phase4 - RECURSION - A recursive binary search function to sort out.  The
 * search is over the indexes [0..14] of a binary search tree, where
 * root=7, root->left=3, root->right=11, and so on.  The user must
 * predict the path through the tree (expressed as a 3-bit int where
 * 0=left, 1=right, read lsb to msb) of the indexes that will be
 * visited during the search for a particular target value, and must
 * input both the path and the target value.
 */
int func4(int val, int low, int high)
{
    int mid;

    mid = low + (high - low) / 2;

    if (mid > val)
	return func4(val, low, mid-1) << 1;
    else if (mid < val)
	return (func4(val, mid+1, high) << 1) + 1;
    else
	return 0;
}


void phase_4(char *input) {
#if defined(PROBLEM)
    int user_val, user_path, result, target_path, numScanned;

    numScanned = sscanf(input, "%d %d", &user_val, &user_path);
    if ((numScanned != 2) || user_val < 0 || user_val > 14) {
	explode_bomb();
    }

    target_path = 1; 
    result = func4(user_val, 1, 1);

    if (result != target_path || user_path != target_path) {
	explode_bomb();
    }
#elif defined(SOLUTION)
    int i;
    int target_path = 2;
    
    for (i=0; i<15; i++) { 
	if (target_path == func4(i, 1, 1))//example solution, not guaranteed to work.
	    break;
    }
	printf("%d %d %s\n", i, target_path);
#else
    invalid_phase("4a");
#endif
}

/* 
 * phase5 - ARRAYS - This stage requires the user to enter 6 unique numbers that 
 * are used as offsets into the integer array.  The sum of the six numbers
 * indexed by the offsets must equal a particular sum.             
 */
void phase_5(char *input)
{
#if defined(PROBLEM)
    static int array[] = {
	3,
	9,
	2,
	1,
	11,
	17,
	8,
	7,
	9,
	6,
	14,
	5,
	12,
	4,
	15,
	13,
    };
    int i, sum;
    int length;

    length = string_length(input);
    if (length != 6)
      explode_bomb();

    sum = 0;
    for (i = 0; i < 6; i++)
      sum += array[ (input[i] & 0x0f) ];

    if (sum != 46)
      explode_bomb();
#elif defined(SOLUTION)
    printf("012567\n"); //the sum of these values at these indexes is 46
#else
    invalid_phase("5");
#endif
}

/* 
 * phase6 - LINKED LIST - The user has to enter the node numbers (from 1 to 6) in 
 * the order that they will occur when the list is sorted in descending order.
 * Code not shown.
 */






