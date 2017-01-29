/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimaxsum;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class MiniMaxSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long n = 0;//how manu numbers
        long array[] = new long[5];//array holding numbers
        String populate[] = null;//initialize the input line
        Scanner input = new Scanner(System.in);//declare scanner
        populate = input.nextLine().split(" ");//retrieve the next line from 
                                               //input buffer and split on
                                               //spaces to populate values
        
        //parse them into integer array                                       
        for (int i = 0; i < populate.length; i++)
        {
            try{array[i] = Long.parseLong(populate[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            if(array[i] < 1 || array[i] > 1000000001)
            {
                System.exit(0);
            }
        }
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[i] > array[j])
                {
                    long x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        
        long minSum = 0;
        for(int i = 0; i < 4; i++)
        {
            minSum += array[i];
        }
        
        long maxSum = 0;
        for(int i = array.length - 1; i > 0; i--)
        {
            maxSum += array[i];
        }
        
        System.out.printf("%d %d", minSum, maxSum);
        
    }
    
}
