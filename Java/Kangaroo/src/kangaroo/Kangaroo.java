/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kangaroo;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class Kangaroo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        int v1 = 0;
        int v2 = 0;
        Scanner scanner = new Scanner(System.in);
        String input[] = null;
        
        input = scanner.nextLine().split(" ");
        
        try{x1 = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        try{v1 = Integer.parseInt(input[1]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        try{x2 = Integer.parseInt(input[2]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        try{v2 = Integer.parseInt(input[3]);}
        catch (NumberFormatException e) {e.printStackTrace();}

        if(x1 < 0 || x1 > 10000 || x1 >= x2)
        {
            System.exit(1);
        }
        
        if(x2 < 0 || x2 > 10000)
        {
            System.exit(1);
        }
        
        if(v1 < 1 || v1 > 10000)
        {
            System.exit(1);
        }    
        
        if(v2 < 1 || v2 > 10000)
        {
            System.exit(1);
        }    
        
        if(v1 <= v2)
        {
            System.out.printf("NO");
        }
        //The first section of the else if revolves around the slope function
        //
        else if(((x1-x2)/(v2-v1)) > 0 &&  (x1 - x2) % (v2 - v1) == 0)
        {
            System.out.printf("YES");
        }
        
        else
        {
            System.out.printf("NO");
        }
        
    }
    
}
