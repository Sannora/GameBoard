package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner columnScanner = new Scanner(System.in);
        System.out.println("Enter the number of the columns of your game board: ");
        int column = columnScanner.nextInt();

        Scanner rowScanner = new Scanner(System.in);
        System.out.println("Enter the number of the rows of your game board: ");
        int row = rowScanner.nextInt();
        
        String[][] board = new String[column][row];

        for(int i = 0; i<=column-1; i++){
            for(int j = 0; j<= row-1; j++){
                board[i][j] = "|_|";
            }
        }
        for(int i = 0; i <=column-1;i++){
            System.out.println();
            for (int j = 0; j <= row-1; j++){
                System.out.printf(board[i][j]);
            }
        }
    }
}