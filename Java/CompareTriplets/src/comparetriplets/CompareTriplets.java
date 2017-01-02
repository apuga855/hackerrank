/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparetriplets;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author alfonso
 */
public class CompareTriplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Alice = 0;
        int Bob = 0;
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        //shorthand if statements because i am beeg and also neeg
        Alice += a0 > b0 ? 1 : 0;
        Alice += a1 > b1 ? 1 : 0;
        Alice += a2 > b2 ? 1 : 0;
        Bob += b0 > a0 ? 1 : 0;
        Bob += b1 > a1 ? 1 : 0;
        Bob += b2 > a2 ? 1 : 0;
        
        System.out.printf("%d %d",Alice, Bob);
    }
    
}
