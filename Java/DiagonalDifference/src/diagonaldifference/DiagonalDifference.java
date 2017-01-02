/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagonaldifference;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author alfonso
 */
public class DiagonalDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 0;
        int matrix[][] = null;
        int solution = 0;
        String insertRow[] = null;
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        Scanner input = new Scanner(System.in);
        try { size = Integer.parseInt(input.nextLine());}
        catch (NumberFormatException e) {e.printStackTrace();}
        matrix = new int[size][size];
        insertRow = new String[size];
        for(int i = 0; i < size; i++)
        {
            insertRow = input.nextLine().split(" ");
            //System.out.printf("entered: %s \n", insertRow);
            for(int j = 0; j < size; j++)
            {
                try{matrix[i][j] = Integer.parseInt(insertRow[j]);}
                catch (NumberFormatException e) {e.printStackTrace();}
            }
        }
        /*
        for(int i = 0; i < size; i++)
        {
            //System.out.printf("entered: %s \n", insertRow);
            for(int j = 0; j < size; j++)
            {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.printf("\n");
        }
           */
        int column = 0;
        for(int i = 0; i < size; i++)
        {
            primaryDiagonal += matrix[i][column];
            secondaryDiagonal += matrix[i][size - column - 1];
            //System.out.printf("size = %d\n column= %d\n targetColumn = %d\n", size,column,size - column - 1);
            //System.out.printf("column =%d",matrix[i][size - column - 1]);
            column++;
        }
        //System.out.printf("Primary Diagonal %d\n", primaryDiagonal);
        //System.out.printf("Secondary Diagonal %d\n", secondaryDiagonal);
        solution = abs(primaryDiagonal - secondaryDiagonal);
        System.out.printf(Integer.toString(solution));
  }
    
}
