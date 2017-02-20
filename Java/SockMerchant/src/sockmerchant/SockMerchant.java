/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockmerchant;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class SockMerchant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        int colorSocks[] = null;
        Scanner scanner = new Scanner(System.in);
        String input[] = null;
        int pairToSell = 0;
        
        input = scanner.nextLine().split(" ");
        try{n = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        if(n < 1 || n > 100)
        {
            System.exit(1);
        }
        
        
        colorSocks = new int[n];
        int[] colorSocksProcess = new int[n];
        input = scanner.nextLine().split(" ");
        for(int i = 0; i < n; i++)
        {
            try{colorSocks[i] = Integer.parseInt(input[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            if(colorSocks[i] < 1 || colorSocks[i] > 100)
            {
                System.exit(1);
            }
            
            colorSocksProcess[i] = colorSocks[i];
        }
        
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(colorSocksProcess[i] == colorSocksProcess[j])
                {
                    pairToSell++;
                    colorSocksProcess[j] = 0;
                    colorSocksProcess[j] -= pairToSell;
                    break;
                }
            }
        }
        
        System.out.printf("%d", pairToSell);
    }
    
}
