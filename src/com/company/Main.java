package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 10;

        char[][] myObj = GameBoard.board(); // OBJ OF THE BOARD

        int[] cc = {1,2,3,4,5,6,7,8,9};

        while(true) {

            GameBoard.printGameBoard(myObj);

            int userIn = in.nextInt(); // TAKES USER INPUT
            int compIn = CheckStatus.randomNumberGen(cc); // RANDOM NUMBER SELECTED BY THE COMPUTER



            CheckStatus.numberChoices(cc,userIn,compIn);

            switch (userIn) {

                case 1:
                    myObj[0][0] = 'X';
                    break;

                case 2:
                    myObj[0][2] = 'X';
                    break;
                case 3:
                    myObj[0][4] = 'X';
                    break;
                case 4:
                    myObj[2][0] = 'X';
                    break;
                case 5:
                    myObj[2][2]= 'X';
                    break;
                case 6:
                    myObj[2][4] = 'X';
                    break;
                case 7:
                    myObj[4][0] = 'X';
                    break;
                case 8:
                    myObj[4][2]= 'X';
                    break;
                case 9:
                    myObj[4][4] = 'X';
                    break;

            }
            switch (compIn) {

                case 1:
                    myObj[0][0] = 'O';
                    break;

                case 2:
                    myObj[0][2] = 'O';
                    break;
                case 3:
                    myObj[0][4] = 'O';
                    break;
                case 4:
                    myObj[2][0] = 'O';
                    break;
                case 5:
                    myObj[2][2]= 'O';
                    break;
                case 6:
                    myObj[2][4] = 'O';
                    break;
                case 7:
                    myObj[4][0] = 'O';
                    break;
                case 8:
                    myObj[4][2]= 'O';
                    break;
                case 9:
                    myObj[4][4] = 'O';
                    break;

            }

            CheckStatus.winingCombo(myObj);


        }



    }

}
