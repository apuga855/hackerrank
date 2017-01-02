import java.io.*;
import java.util.*;

public class SimpleArraySum {

    public static void main(String[] args) {
        int size = 0;
        int array[] = null;
        int solution = 0;
        Scanner input = new Scanner(System.in);
        String populate[] = null;
        System.out.printf("Please enter the size of the array \n");
        //This is because java is fucking retarded and it cant do a next int 
        //with a next line. Next leaves a trailing sentence terminator which 
        //causes you to have to fucking do a useless next line after. I say 
        //fuck that noise and just try to parse the number out of the string 
        //originally, fucking yolo
        try { size = Integer.parseInt(input.nextLine());}
        catch (NumberFormatException e) {e.printStackTrace();}
        System.out.printf("Please enter the array of numbers to populate\n");
        array = new int[size];
        populate = input.nextLine().split(" ");
        for (int i = 0; i < populate.length; i++)
        {
            try{array[i] = Integer.parseInt(populate[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
            solution = solution + array[i];
        }
        System.out.printf(Integer.toString(solution));
    }
}