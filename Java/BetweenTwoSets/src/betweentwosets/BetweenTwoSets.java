/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betweentwosets;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class BetweenTwoSets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] arrayA = null;
        int [] arrayB = null;
        int n = 0;//size of A
        int m = 0;//size of B
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        String input[] = null;
        int numbersBetweenTwoSets = 0;
        boolean betweenTwoSets = true;
        
        input = scanner.nextLine().split(" ");
        
        try{n = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        try{m = Integer.parseInt(input[1]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        
        arrayA = new int[n];
        arrayB = new int[m];
        
        if(n < 1)
        {
            System.exit(1);
        }
        
        if(m > 10)
        {
            System.exit(1);
        }        
        
        input = scanner.nextLine().split(" ");//getting all values in A
        for(int i = 0; i < n; i++)
        {
            try{arrayA[i] = Integer.parseInt(input[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            if(arrayA[i] < 1 || arrayA[i] > 100)
            {
                System.exit(1);
            }
        }
        
        input = scanner.nextLine().split(" ");//getting all values in B
        for(int i = 0; i < m; i++)
        {
            try{arrayB[i] = Integer.parseInt(input[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            if(arrayB[i] < 1 || arrayB[i] > 100)
            {
                System.exit(1);
            }
        }
        
        int [] membersOfSet = new int[100];
        for(int i = 0; i < 100; i++)
        {
            membersOfSet[i] = i + 1;
        }
        
        for(int j = 0; j < 100; j++)
        {
            for(int i = 0; i < m; i++)
            {
                if(arrayB[i] % membersOfSet[j] != 0)
                {
                    betweenTwoSets = false;
                    break;
                }
            }
            
            if(betweenTwoSets)
            {
                for(int i = 0; i < n; i++)
                {
                    if(membersOfSet[j] % arrayA[i] != 0)
                    {
                        betweenTwoSets = false;
                        break;
                    }
                }
            }
            
            if(betweenTwoSets)
            {
                //System.out.printf("%d", membersOfSet[j]);
                numbersBetweenTwoSets++;
            }
            betweenTwoSets = true;
        }
        
        System.out.printf("%d", numbersBetweenTwoSets);
        
    }
    
}
