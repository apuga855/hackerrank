/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appleandorange;
import java.util.*;

/**
 *
 * @author Alfonso
 */
public class AppleAndOrange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s = 0;
        int t = 0;
        int a = 0;
        int b = 0;
        int m = 0;
        int n = 0;
        int[] appleDistances = null;
        int[] orangeDistances = null;
        int applesOnHouse = 0;
        int orangesOnHouse = 0;
       
        Scanner scanner = new Scanner(System.in);
        String[] input = null;
        
        input = scanner.nextLine().split(" ");
        try{s = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        if(s < 1 || s > 100000)
        {
            System.exit(1);
        }
        try{t = Integer.parseInt(input[1]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        if(t < 1 || s > 100000)
        {
            System.exit(1);
        }
        input = scanner.nextLine().split(" ");
        try{a = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        if(a < 1 || s > 100000)
        {
            System.exit(1);
        }
        try{b = Integer.parseInt(input[1]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        if(b < 1 || s > 100000)
        {
            System.exit(1);
        }
        
        
        input = scanner.nextLine().split(" ");
        try{m = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        if(m < 1 || s > 100000)
        {
            System.exit(1);
        }
        try{n = Integer.parseInt(input[1]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        if(n < 1 || s > 100000)
        {
            System.exit(1);
        }
        
        input = scanner.nextLine().split(" ");
        appleDistances = new int[input.length];
        for(int i = 0; i < input.length; i++)
        {
            try{appleDistances[i] = Integer.parseInt(input[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            if(appleDistances[i] < -100000 || appleDistances[i] > 100000)
            {
                System.exit(1);
            }
        }
        
        input = scanner.nextLine().split(" ");
        orangeDistances = new int[input.length];
        for(int i = 0; i < input.length; i++)
        {
            try{orangeDistances[i] = Integer.parseInt(input[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            if(orangeDistances[i] < -100000 || orangeDistances[i] > 100000)
            {
                System.exit(1);
            }
        }
        
        for(int i = 0; i < appleDistances.length; i++)
        {
            if(a + appleDistances[i] >= s && a + appleDistances[i] <= t )
            {
                applesOnHouse++;
            }
        }
        
        for(int i = 0; i < orangeDistances.length; i++)
        {
            if(b + orangeDistances[i] >= s && b + orangeDistances[i] <= t )
            {
                orangesOnHouse++;
            }
        }
        
        System.out.printf("%d\n", applesOnHouse);
        System.out.printf("%d\n", orangesOnHouse);
    }
    
}
