/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonappetit;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class BonAppetit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        int k = 0;
        int[] cost = null;
        int totalCost = 0;
        int actualAnaCost = 0;
        int anaCost = 0;
        Scanner scanner = new Scanner(System.in);
        String input[] = null;
        
        input = scanner.nextLine().split(" ");
        
        try{n = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        
        if(n < 2 || n > 100000)
        {
            System.exit(1);
        }
        
        try{k = Integer.parseInt(input[1]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        
        if(k < 0 || k > n)
        {
            System.exit(1);
        }
        
        input = scanner.nextLine().split(" ");
        cost = new int[n];
        for(int i = 0; i < n; i++)
        {
            try{cost[i] = Integer.parseInt(input[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            if(cost[i] < 0 || cost[i] > 10000)
            {
                System.exit(1);
            }
            totalCost += cost[i];
            actualAnaCost += (i == k ) ? 0 : cost[i];
        }
        
        input = scanner.nextLine().split(" ");
        
        try{anaCost = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        
        if(anaCost < 0 || anaCost > totalCost)
        {
            System.exit(1);
        }
        
        actualAnaCost = actualAnaCost/2;
        
        //System.out.printf("Total cost: %d\n", totalCost);
        //System.out.printf("Ana Cost: %d\n", anaCost);
        //System.out.printf("Actual Ana Cost: %d\n", actualAnaCost);
        //System.out.printf("\n\n\n", totalCost);
        
        if(actualAnaCost == anaCost)
        {
            System.out.printf("Bon Appetit");
        }
        else
        {
            System.out.printf("%d", anaCost - actualAnaCost);
        }
    }
    
}
