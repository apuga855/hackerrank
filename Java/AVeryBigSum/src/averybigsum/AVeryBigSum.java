/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averybigsum;
import java.io.*;
import java.util.*;
/**
 *
 * @author alfonso
 */
public class AVeryBigSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 0;
        double array[] = null;
        double solution = 0;
        Scanner input = new Scanner(System.in);
        String populate[] = null;
        //System.out.printf("Please enter the array of numbers to populate\n");
        try { size = Integer.parseInt(input.nextLine());}
        catch (NumberFormatException e) {e.printStackTrace();}
        array = new double[size];
        populate = input.nextLine().split(" ");
        for (int i = 0; i < populate.length; i++)
        {
            try{array[i] = Double.parseDouble(populate[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            solution = solution + array[i];
        }
        System.out.printf("%.0f",solution);
    }
}
