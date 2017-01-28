/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararrayrotation;

import java.util.*;

/**
 *
 * @author alfonso
 */
public class CircularArrayRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        int q = 0;
        int m = 0;
        int a[] = null;
        int size = 3;
        int query = 0;
        Scanner input = new Scanner(System.in);
        String populate[] = null;
        a = new int[size];
        populate = input.nextLine().split(" ");
        try{n = Integer.parseInt(populate[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        System.out.printf("%d\n", n);
        try{k = Integer.parseInt(populate[1]);}
        catch (NumberFormatException e) {e.printStackTrace();}  
        System.out.printf("%d\n", k);          
        try{q = Integer.parseInt(populate[2]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        System.out.printf("%d\n", q);
        if(1 >= n || 100000 <= n)
        {
            System.exit(0);
        }
        if(1 >= k || 100000 <= k)
        {
            System.exit(0);
        }
        if(1 >= n || 500 <= n)
        {
            System.exit(0);
        }
        populate = input.nextLine().split(" ");
        for (int i = 0; i < populate.length; i++)
        {
            try{a[i] = Integer.parseInt(populate[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            if(1 > a[i] || 100000 <= a[i])
            {
                System.exit(0);
            }
            System.out.printf("%d", a[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < k; i++)
        {
            rightCircularShift(a);
        }
        for(int i = 0; i < q; i++)
        {
            try{query = Integer.parseInt(input.nextLine());}
            catch (NumberFormatException e) {e.printStackTrace();}
            System.out.printf("%d\n", a[i]);
        }
        System.out.printf("\n");
    }
    
    private static void rightCircularShift(int array[])
    {
        int end = array[array.length - 1];
        int t = 0;
        System.out.printf("end: %d\n", end);
        System.out.printf("length: %d\n", array.length);
        for(int i = 0; i < array.length - 1; i++)
        {
            t = array[i+1];
            array[i + 1] = array[i];
        }
        array[0] = end;
        System.out.printf("after swap: ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("\n");
        
    }
    
}
