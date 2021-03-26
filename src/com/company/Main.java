package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        char[][] myObj = GameBoard.board(); // OBJ OF THE BOARD
        while(true) {


            GameBoard.printGameBoard(myObj);

            int userIn = in.nextInt(); // TAKES USER INPUT

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

            CheckStatus.winingCombo(myObj);
        }


    }

}
