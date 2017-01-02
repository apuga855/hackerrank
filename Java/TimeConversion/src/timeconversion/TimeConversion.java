/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconversion;

import java.util.Scanner;

/**
 *
 * @author alfonso
 */
public class TimeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String time[] = null;
        Scanner input = new Scanner(System.in);
        double hours = 0;
        String minutes = null;
        String seconds = null;
        time = input.nextLine().split(":");
        try{hours= Double.parseDouble(time[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        try{minutes = time[1];}
        catch (NumberFormatException e) {e.printStackTrace();}
        try{seconds = time[2];}
        catch (NumberFormatException e) {e.printStackTrace();}
        //System.out.printf("%s\n", time[time.length-1].toLowerCase());
        if(time[time.length-1].contains("pm")||time[time.length-1].contains("PM"))
        {
            hours += hours != 12 ? 12 : 0;
        }
        else
        {
            hours = hours == 12 ? 0 : hours;
        }
        seconds = seconds.split("PM|AM|pm|am")[0];
        System.out.printf("%02.0f:%s:%s\n",hours,minutes,seconds);
    }
    
}
