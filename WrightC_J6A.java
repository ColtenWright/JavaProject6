// Colten Wright
// Exam Scores Calculator - WrightC_J6A

import java.util.Scanner;

public class WrightC_J6A
{
   public static void main(String[] args)
   {
      //Create new Array for student's scores
      int[] scores = new int [5];
      //Get user data
      Scanner keyboard = new Scanner(System.in);
      //Get first students score
      System.out.println("Enter the first students score.");
      System.out.println(" ");
      scores[0] = keyboard.nextInt();
      System.out.println("You entered: " + scores[0]);
      System.out.println(" ");
      //Get second students score
      System.out.println("Enter the second students score.");
      System.out.println(" ");
      scores[1] = keyboard.nextInt();
      System.out.println("You entered: " + scores[1]);
      System.out.println(" ");
      //Get third students score
      System.out.println("Enter the third students score.");
      System.out.println(" ");
      scores[2] = keyboard.nextInt();
      System.out.println("You entered: " + scores[2]);
      System.out.println(" ");
      //Get fourth studnets score
      System.out.println("Enter the fourth students score.");
      System.out.println(" ");
      scores[3] = keyboard.nextInt();
      System.out.println("You entered: " + scores[3]);
      System.out.println(" ");
      //Get fifth students score
      System.out.println("Enter the fifth students score.");
      System.out.println(" ");
      scores[4] = keyboard.nextInt();
      System.out.println("You entered: " + scores[4]);
      System.out.println(" ");
      //Initialize max
      int max = scores[0];
      //Calculate and display scores
      calcMax(scores, max);
      calcCurve(scores, max);
      displayScores(scores);
      
   }
      
      public static int calcMax(int scores[], int max)
         {
            //Determine max
            for (int i = 1; i < scores.length; i++)
            {
               if (scores[i] > max)
               {
                  max = scores[i];
               }
            }
            
            return max;
         }
         
      public static int[] calcCurve(int scores[], int max)
      {
         int[] curvedScores = new int [5];
         int curve = (100 - max);
         scores[0] = (scores[0] + curve);
         scores[1] = (scores[1] + curve);
         scores[2] = (scores[2] + curve);
         scores[3] = (scores[3] + curve);
         scores[4] = (scores[4] + curve);
         return scores;
       }
       
       public static void displayScores(int curvedScores[])
       {
         double averageScore = ((curvedScores[0]+curvedScores[1]+curvedScores[2]+curvedScores[3]+curvedScores[4]) / curvedScores.length);
         System.out.println("Student 1's final score is: " + curvedScores[0]);
         System.out.println("Student 2's final score is: " + curvedScores[1]);
         System.out.println("Student 3's final score is: " + curvedScores[2]);
         System.out.println("Student 4's final score is: " + curvedScores[3]);
         System.out.println("Student 5's final score is: " + curvedScores[4]);
         System.out.println("The average on the exam for the class is: " + averageScore);
       }
}