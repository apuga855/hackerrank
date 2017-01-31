/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designerpdfviewer;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class DesignerPDFViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long array[] = new long[26];//array holding numbers
        String text = null;
        String populate[] = null;//initialize the input line
        Scanner input = new Scanner(System.in);//declare scanner
        populate = input.nextLine().split(" ");//retrieve the next line from 
                                               //input buffer and split on
                                               //spaces to populate values
        
        //parse them into integer array                                       
        for (int i = 0; i < populate.length; i++)
        {
            try{array[i] = Long.parseLong(populate[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            if(array[i] < 1 || array[i] > 7)
            {
                System.exit(1);
            }
        }
        
        text = input.nextLine();//retrieve the text
        if(text.length() > 10)
        {
            System.exit(1);
        }
        
        for(int i = 0; i < text.length(); i++)
        {
            if(Character.isUpperCase(text.charAt(i)))
            {
                System.exit(1);
            }
        }
        
        //ascii for lower case starts at 97 to 122
        long max = 0;
        for(int i = 0; i < text.length(); i++)
        {
            max = max > array[((int)text.charAt(i) - 97)] ? max : array[((int)text.charAt(i) - 97)];
        }
        
        
        System.out.printf("%d",text.length() * max);
    }
    
}
