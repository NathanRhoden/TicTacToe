package com.company;

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
        if(gameboard[0][0]  == 'O' && gameboard[0][2] == 'X' && gameboard[0][4] =='X')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[0][0]  == 'O' && gameboard[2][0] == 'X' && gameboard[4][0] =='X')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[0][0]  == 'O' && gameboard[2][2] == 'X' && gameboard[4][4] =='X')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[2][0]  == 'O' && gameboard[2][2] == 'X' && gameboard[2][4] =='X')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[4][0]  == 'O' && gameboard[4][2] == 'X' && gameboard[4][4] =='X')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[0][2]  == 'O' && gameboard[2][2] == 'X' && gameboard[4][2] =='X')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[0][4]  == 'O' && gameboard[2][4] == 'X' && gameboard[4][4] =='X')
        {
            System.out.println("PLAYER 2 WINS");

        }
        else if(gameboard[0][4]  == 'X' && gameboard[2][2] == 'X' && gameboard[4][0] =='X')
        {
            System.out.println("PLAYER 2 WINS");


        }
    }
    

}
