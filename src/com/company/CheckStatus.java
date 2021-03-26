package com.company;

public class CheckStatus {

    public static void winingCombo(char[][] gameboard)
    {
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
    }
    

}
