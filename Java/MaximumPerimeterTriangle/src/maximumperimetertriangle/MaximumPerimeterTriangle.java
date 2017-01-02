/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumperimetertriangle;

import java.util.Scanner;

/**
 *
 * @author alfonso
 */
public class MaximumPerimeterTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 0;
        int sticks[] = null;
        Scanner input = new Scanner(System.in);
        String insertNums[] = null;
        try { size = Integer.parseInt(input.nextLine());}
        catch (NumberFormatException e) {e.printStackTrace();}
        sticks = new int[size];
        insertNums = input.nextLine().split(" ");
        for(int i = 0; i < size; i++)
        {
            try { sticks[i] = Integer.parseInt(insertNums[i]);}
            catch (NumberFormatException e) {e.printStackTrace();}
        }
        
        quickSort(sticks,0,sticks.length);
        for(int i = 0; i < size; i++)
        {
            System.out.printf("%d", sticks[i]);
        }
    }
    
    public static boolean degenerateTringle(int sideA, int sideB, int sideC)
    {
        boolean degenerate = false;
        if(sideA == 0 || sideB == 0|| sideC == 0)
            degenerate = true;
        if(sideA + sideB < sideC)
            degenerate = true;
        if(sideA + sideC < sideB)
            degenerate = true;
        if(sideC + sideB < sideA)
            degenerate = true;
        return degenerate;
    }
    
    public static void quickSort(int[] numbers, int left, int right)
    {
        int index = quickSortPartition(numbers, left, right);
        if(left < index - 1)
            quickSort(numbers,left,right);
        if(index < right)
            quickSort(numbers, index, right);
    }
    
    public static int quickSortPartition(int [] numbers, int left, int right)
    {
        int temp = 0;
        int pivot = numbers[(right - left)/2];
        while(left <= right)
        {
            while(numbers[left] < numbers[pivot])
                left++;
            while(numbers[right] > pivot)
                right--;
            if(left >= right)
                break;
            else
            {
                temp = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
