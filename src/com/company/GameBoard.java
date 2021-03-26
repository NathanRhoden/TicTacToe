package com.company;

import java.util.Scanner;

public class GameBoard {

    public static char[][] board(){

        char[][] arr= {{' ','|',' ','|',' '},
                {'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},
                {' ','|',' ','|',' '}};

        return arr;
    }


    public static void printGameBoard(char[][] board) {

        for(char[] row : board){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }


    }

    static int player_Select(){
        //ASSIGNS PLAYER TO EITHER P1 OR P2 DEPENDING ON CHOICE -- NEED TO RESTRICT THE INPUT TO 1 OR 2

        System.out.println("Would you like to take the first turn or the second ?");

        Scanner player_Choice = new Scanner(System.in);

        int result;

        int user_Input = player_Choice.nextInt();

        if(user_Input == 1){

            result = 1;
        }
        else
        {
            result = -1 ;
        }

        return  result;




    }



}
