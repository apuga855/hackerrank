/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angryprofessor;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class AngryProfessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int testCasesNum = 0;
        TestCase[] testCases = null;
        Scanner scanner = new Scanner(System.in);
        String input[] = null;
        
        input = scanner.nextLine().split(" ");
        try{testCasesNum = Integer.parseInt(input[0]);}
        catch (NumberFormatException e) {e.printStackTrace();}
        
        testCases = new TestCase[testCasesNum];
        
        for(int i = 0; i < testCasesNum; i++)
        {
            testCases[i] = new TestCase();
            input = scanner.nextLine().split(" ");
            try{testCases[i].setStudents(Integer.parseInt(input[0]));}
            catch (NumberFormatException e) {e.printStackTrace();}
            try{testCases[i].setCancelationThreshold(Integer.parseInt(input[1]));}
            catch (NumberFormatException e) {e.printStackTrace();}
            input = scanner.nextLine().split(" ");
            testCases[i].setArrivalTimes(input);
            testCases[i].EvaluateTestCase();
        }
        
    }
    
    public static class TestCase
    {
        //private member Section start
        
        private int students;
        private int cancelationThreshold;
        private int[] arrivalTimes;
        
        //private member section end
        
        //public constructor section start
        public TestCase()
        {
            students = 0;
            cancelationThreshold = 0;
            int[] arrivalTimes = null;
        }
        
        public TestCase(int stu, int threshold, int[] arrivals)
        {
            students = stu;
            cancelationThreshold = threshold;
            arrivalTimes = arrivals;
        }
        
        //public constructor section end
        
        //Get functions start
        public int getStudents(){return students;}
        public int getThreshold(){return cancelationThreshold;}
        public int[] getArrivalTimes(){return arrivalTimes;}
        //get functions end
        
        //set functions start
        public void setStudents(int stu)
        {
            if(stu < 1 || stu > 1000)
            {
                System.exit(1);
            }
            students = stu;
        }
        public void setCancelationThreshold(int threshold)
        {           
            if(threshold < 1 || threshold > students)
            {
                System.exit(1);
            }
            cancelationThreshold = threshold;
        }
        public void setArrivalTimes(int[] arrivals)
        {
            arrivalTimes = arrivals;
            for(int i = 0; i < arrivalTimes.length; i++)
            {
                if(arrivalTimes[i] < -100 || arrivalTimes[i] > 100)
                {
                    System.exit(1);
                }
            }
        }
        
        public void setArrivalTimes(String[] arrivals)
        {
            arrivalTimes = new int [arrivals.length];
            for(int i = 0; i < arrivalTimes.length; i++)
            {
                try{arrivalTimes[i] = Integer.parseInt(arrivals[i]);}
                catch (NumberFormatException e) {e.printStackTrace();}
                if(arrivalTimes[i] < -100 || arrivalTimes[i] > 100)
                {
                    System.exit(1);
                }
            }
        }
        //set functions end
        
        //public functions start
        public void EvaluateTestCase()
        {
            int counter = 0;
            for(int i = 0; i < arrivalTimes.length; i++)
            {
                counter = 0;
                for(int j = 0; j < arrivalTimes.length; j++)
                {
                    if(arrivalTimes[j] <= 0)
                    {
                        counter++;
                    }
                }
            }
            
            //System.out.printf("Cancelation Threshold = %d Counter Attending = %d\n",cancelationThreshold, counter);
            
            if(counter >= cancelationThreshold)
            {
                System.out.printf("NO\n");
            }
            else
            {
                System.out.printf("YES\n");
            }
        }
        //public functions end
    };
}
