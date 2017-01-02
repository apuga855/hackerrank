/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusminus;

import java.util.Scanner;

/**
 *
 * @author alfonso
 */
public class PlusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 0;
        int solution = 0;
        double array[] = null;
        double positive = 0;
        double negative = 0;
        double zero = 0;
        String insertArray[] = null;
        Scanner input = new Scanner(System.in);
        try { size = Integer.parseInt(input.nextLine());}
        catch (NumberFormatException e) {e.printStackTrace();}
        array = new double[size];
        insertArray = input.nextLine().split(" ");
        for(int i = 0; i < insertArray.length; i++)
        {
            try{array[i] = Integer.parseInt(insertArray[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            positive += array[i] > 0 ? 1 : 0;
            negative += array[i] < 0 ? 1 : 0;
            zero += array[i] == 0 ? 1 : 0;
        }
        System.out.printf("%.4f\n",positive/size);
        System.out.printf("%.4f\n",negative/size);
        System.out.printf("%.4f\n",zero/size);
    }
    
}
