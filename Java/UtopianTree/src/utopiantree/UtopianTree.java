/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utopiantree;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class UtopianTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int testCases = 0;
        int[] nCyclesPerTest = null;
        int[] herightTestCases = null;
        Scanner scanner = new Scanner(System.in);
        String input[] = null;
        
        input = scanner.nextLine().split(" ");
        try{testCases = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        
        if(testCases < 1 || testCases > 10)
        {
            System.exit(1);
        }
        
        nCyclesPerTest = new int[testCases];
        herightTestCases = new int[testCases];
        for(int i = 0; i < testCases; i++)
        {
            input = scanner.nextLine().split(" ");
            try{nCyclesPerTest[i] = Integer.parseInt(input[0]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            
            if(nCyclesPerTest[i] < 0 || nCyclesPerTest[i] > 60)
            {
                System.exit(1);
            }
        }
        
        for(int i = 0; i < testCases; i++)
        {
            System.out.printf("%d\n", calcGrowth(nCyclesPerTest[i], 1));//the base height of the tree is 1, this is given
        }
        
        
        
    }
    
    public static int calcGrowth(int cycles, int baseGrowth)
    {
        int calculatedGrowth = baseGrowth;
        
        do
        {
            if(cycles != 0)
            {
                calculatedGrowth *= 2;
                cycles--;
            }
            
            if(cycles != 0)
            {
                calculatedGrowth += 1;
                cycles--;
            }
        }while(cycles != 0);
        
        return calculatedGrowth;
    }
}
