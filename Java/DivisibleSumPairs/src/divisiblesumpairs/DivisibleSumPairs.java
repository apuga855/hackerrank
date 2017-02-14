/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiblesumpairs;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class DivisibleSumPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        int a[] = null;
        int k = 0;
        int pairs = 0;
        Scanner scanner = new Scanner(System.in);
        String input[] = null;
        
        input = scanner.nextLine().split(" ");
        
        try{n = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        
        try{k = Integer.parseInt(input[1]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        
        if(n < 2 || n > 100)
        {
            System.exit(1);
        }
        
        if(k < 1 || k > 100)
        {
            System.exit(1);
        }
        
        input = scanner.nextLine().split(" ");
        a = new int[n];
        for(int i = 0; i < n; i++)
        {
            try{a[i] = Integer.parseInt(input[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            if(a[i] < 1 || a[i] > 100)
            {
                System.exit(1);
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                //System.out.printf("Value of i = %d\n",i);
                //System.out.printf("Value of j = %d\n",j);
                //System.out.printf("Value of a[i] = %d\n",a[i]);
                //System.out.printf("Value of a[j] = %d\n",a[j]);
                //System.out.printf("\n\n");
                if(i < j && (a[i] + a[j])% k == 0)
                {
                    pairs++;
                }
            }
        }
        System.out.printf("%d",pairs);
    }
    
}
