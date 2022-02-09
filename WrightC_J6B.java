// Colten Wright
// Budget - WrightC_J6B

import java.util.Scanner;
import java.util.ArrayList;

public class WrightC_J6B
{
   public static void main(String[] args)
   {
      //Int Variables
      int incomeItems, expenseItems;
      //Get user data
      Scanner keyboard = new Scanner(System.in);
      //Receive number of items from user
      System.out.println("How many income items are there?");
      incomeItems = keyboard.nextInt();
      System.out.println(" ");
      System.out.println("How many expense items are there?");
      expenseItems = keyboard.nextInt();
      System.out.println(" ");
      //Create ArrayLists
      ArrayList<String> incomeItemList = new ArrayList<String>(incomeItems);
      ArrayList<Double> incomeAmountList = new ArrayList<Double>(incomeItems);
      ArrayList<String> expenseItemList = new ArrayList<String>(expenseItems);
      ArrayList<Double> expenseAmountList = new ArrayList<Double>(expenseItems);
      //Loop to determine description of Income Items
      for ( int index = 0; index < incomeItems; index++)
      {
         System.out.println("What is the #"  + (index + 1) +  " income item?");
         incomeItemList.add(keyboard.next());
         keyboard.nextLine();
         System.out.println(" ");
      }
      //Loop to determine Income Items Amount
      for ( int index = 0; index < incomeItems; index++)
      {
         System.out.println("What is the amount of the #" + (index + 1) +  " income item?");
         incomeAmountList.add(keyboard.nextDouble());
         System.out.println(" ");
      }
      //Loop to determine description of Expense Items
      for ( int index = 0; index < expenseItems; index++)
      {
         System.out.println("What is the #"  + (index + 1) +  " expense item?");
         expenseItemList.add(keyboard.next());
         keyboard.nextLine();
         System.out.println(" ");
      }
      //Loop to determine Expense Items Amount
      for ( int index = 0; index < expenseItems; index++)
      {
         System.out.println("What is the amount of the #"  + (index + 1) +  " expense item?");
         expenseAmountList.add(keyboard.nextDouble());
         System.out.println(" ");
      }
      //Loop to determine Income Items Total
      double incomeTotal = 0;
      for ( int index = 0; index < incomeAmountList.size(); index++)
      {
         incomeTotal += incomeAmountList.get(index);
      }
      //Loop to determine Expense Items Total
      double expenseTotal = 0;
      for ( int index = 0; index < expenseAmountList.size(); index++)
      {
         expenseTotal += expenseAmountList.get(index);
      }
      //Calculation for grandTotal
      double grandTotal = incomeTotal - expenseTotal;
      //Display results
      //Display income information
      for (int index = 0; index < incomeAmountList.size(); index++)
      {
         System.out.println(incomeItemList.get(index) + ": " + incomeAmountList.get(index));
      }
      System.out.println("Total income is: " + incomeTotal);
      //Display expense information
      System.out.println(" ");
      for (int index = 0; index < expenseAmountList.size(); index++)
      {
         System.out.println(expenseItemList.get(index) + ": " + expenseAmountList.get(index));
      }
      System.out.println("Total expenses are: " + expenseTotal);
      System.out.println(" ");
      System.out.println("The Grand Total is: " + grandTotal);

   }
}