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
        int n = 0;//how manu numbers
        int k = 0;//how many rotations
        int q = 0;//how many numbers will be asked for after the rotation
        int m = 0;//index
        int a[] = null;//array holding numbers
        int query = 0;
        Scanner input = new Scanner(System.in);//declare scanner
        String populate[] = null;//initialize the input line
        populate = input.nextLine().split(" ");//retrieve the next line from 
                                               //input buffer and split on
                                               //spaces to populate values
        try{n = Integer.parseInt(populate[0]);}//parse the integer to n
        catch (NumberFormatException e) {e.printStackTrace();}
        //System.out.printf("%d\n", n);
        try{k = Integer.parseInt(populate[1]);}//parse the integer to k
        catch (NumberFormatException e) {e.printStackTrace();}  
        //System.out.printf("%d\n", k);          
        try{q = Integer.parseInt(populate[2]);}//parse the integer to q
        catch (NumberFormatException e) {e.printStackTrace();}
        //System.out.printf("%d\n", q);
        //check for boundaries
        if(n < 1|| n >= 100001)
        {
            System.exit(0);
        }
        if(k < 1 || k >= 100001)
        {
            System.exit(0);
        }
        if(q < 1 || q > 501)
        {
            System.exit(0);
        }
        //retrieve numbers for array splitting on spaces
        a = new int[n];//initialize the int array
        populate = input.nextLine().split(" ");
        for (int i = 0; i < populate.length; i++)
        {
            //parse them into integer array
            try{a[i] = Integer.parseInt(populate[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            //check for boundaries
            if(a[i] < 1 || a[i] > 100001)
            {
                System.exit(0);
            }
            //System.out.printf("%d", a[i]);
        }
        //System.out.printf("\n");
        //perform the circular rotation operation
        for (int i = 0; i < k; i++)
        {
            rightCircularShift(a);
        }
        for(int i = 0; i < q; i++)
        {
            try{query = Integer.parseInt(input.nextLine());}
            catch (NumberFormatException e) {e.printStackTrace();}
            System.out.printf("%d\n", a[query]);
        }
        System.out.printf("\n");
    }
    
    private static void rightCircularShift(int array[])
    {
        //select the end of the array
        int end = array[array.length - 1];
        //System.out.printf("end: %d\n", end);
        //System.out.printf("length: %d\n", array.length);
        //swap the current with currents previous so on and so forth
        for(int i = array.length - 1; i > 0; i--)
        {
            array[i] = array[i - 1];
        }
        //place the end at the front
        array[0] = end;
        //System.out.printf("after swap: ");
        /*
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("\n");
        */
    }
    
}
