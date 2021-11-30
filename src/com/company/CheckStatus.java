package com.company;

import java.util.ArrayList;
import java.util.Random;

public class CheckStatus {

    public static void winingCombo(char[][] gameboard)
    {
        // PLAYER 1 COMBINATIONS WINS
        if(gameboard[0][0]  == 'X' && gameboard[0][2] == 'X' && gameboard[0][4] =='X')
        {
            System.out.println("PLAYER 1 WINS");

        }
        else if(gameboard[0][0]  == 'X' && gameboard[2][0] == 'X' && gameboard[4][0] =='X')
        {
            System.out.println("PLAYER 1 WINS");

        }
        else if(gameboard[0][0]  == 'X' && gameboard[2][2] == 'X' && gameboard[4][4] =='X')
        {
            System.out.println("PLAYER 1 WINS");

        }
        else if(gameboard[2][0]  == 'X' && gameboard[2][2] == 'X' && gameboard[2][4] =='X')
        {
            System.out.println("PLAYER 1 WINS");

        }
        else if(gameboard[4][0]  == 'X' && gameboard[4][2] == 'X' && gameboard[4][4] =='X')
        {
            System.out.println("PLAYER 1 WINS");

        }
        else if(gameboard[0][2]  == 'X' && gameboard[2][2] == 'X' && gameboard[4][2] =='X')
        {
            System.out.println("PLAYER 1 WINS");

        }
        else if(gameboard[0][4]  == 'X' && gameboard[2][4] == 'X' && gameboard[4][4] =='X')
        {
            System.out.println("PLAYER 1 WINS");

        }
        else if(gameboard[0][4]  == 'X' && gameboard[2][2] == 'X' && gameboard[4][0] =='X')
        {
            System.out.println("PLAYER 1 WINS");


        }
        //PLAYER 2 COMBINATION WINS
        if(gameboard[0][0]  == 'O' && gameboard[0][2] == 'O' && gameboard[0][4] =='O')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[0][0]  == 'O' && gameboard[2][0] == 'O' && gameboard[4][0] =='O')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[0][0]  == 'O' && gameboard[2][2] == 'O' && gameboard[4][4] =='O')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[2][0]  == 'O' && gameboard[2][2] == 'O' && gameboard[2][4] =='O')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[4][0]  == 'O' && gameboard[4][2] == 'O' && gameboard[4][4] =='O')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[0][2]  == 'O' && gameboard[2][2] == 'O' && gameboard[4][2] =='O')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[0][4]  == 'O' && gameboard[2][4] == 'O' && gameboard[4][4] =='O')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[0][4]  == 'O' && gameboard[2][2] == 'O' && gameboard[4][0] =='O')
        {
            System.out.println("PLAYER 2 WINS");

        }
    }
   public static int[] numberChoicesUser(int[] array, int userIn){ //TURNS NUMBERS CHOSEN IN THE ARRAY TO 0 WHEN CHOSEN

        for(int i = 0 ; i < array.length; i++){

            if(userIn == array[i]){
                array[i] = 0;
            }

        }
        return array;
    }

     public static int[] numberChoicesComp(int[] array , int compIn){

         for(int i = 0 ; i < array.length; i++) {

             if (compIn == array[i]) {
                 array[i] = 0;
             }


         }
         return array;

     }

    public static int randomNumberGen(int[] array){ //SELECTS RANDOM ELEMENT IF IT SELECTS 0 IT WILL SELECT AGAIN

        Random rand1 = new Random();

        int numberSelect = rand1.nextInt(array.length);
        int num = (array[numberSelect]);

        while(num == 0){ // WILL KEEP CHOOSING UNTIL IT DOES NOT HIT ZERO

            numberSelect = rand1.nextInt(array.length);
            num = (array[numberSelect]);
        }

        System.out.println(num);


        return num;
    }


}




    


