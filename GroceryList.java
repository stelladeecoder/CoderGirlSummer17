/**
 * This program takes the names of 3 items on a grocery list
the quantity to purchase, and the cost, and calculates the total grocery bill.
 * @author (Delores Carey)
 * @version (July 24, 2017)
 */ 
import static java.lang.System.out;

import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        //Set up keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Print a message for the user
        out.println("Please list three items on your grocery list. \n");

        // Ask for the name of Item 1 
        out.println("Item 1? ");

        //Declare a variable of type String with variable name "First"
        String First;
        //Wait for user to answer. Assign that value to variable First
        First = keyboard.nextLine();
        // Ask for the name of Item 2 
        out.println("Item 2? ");
        //Declare a variable of type String with variable name "Second"
        String Second;
        //Wait for user to answer. Assign that value to variable Second
        Second = keyboard.nextLine();
        // Ask for the name of Item 3
        out.println("Item 3? ");
        //Declare a variable of type String with variable name "Third"
        String Third;
        //Wait for user to answer. Assign that value to variable Third
        Third = keyboard.nextLine();

        System.out.print("\n");
        //Ask for quantity of each item 
        out.println("Now, please enter the quantity of each item. \n");
        //Ask How many of item 1 (variable "First")
        out.println("How many " + First + "?");
        //This is a whole number
        int firstNo = keyboard.nextInt();
        //Ask How many of item 2 (variable "Second")
        out.println("How many " + Second + "?");
        //This is a whole number 
        int secondNo = keyboard.nextInt();
        //Ask How many of item 3 (variable "Third")
        out.println("How many " + Third + "?");
        //This is a whole number 
        int thirdNo = keyboard.nextInt();

        System.out.print("\n");
        //Ask the price of each item
        out.println("Now, please enter price of each item. \n");
        //Ask how much does item 1 "First" cost
        out.println("How much does one " + First + " cost?"); 
        //This number can have a decimal
        float price1 = keyboard.nextFloat();

        price1 = firstNo * price1;
        //Ask how much does item 2 "Second" cost
        out.println("How much does one " + Second + " cost?");

        float price2 = keyboard.nextFloat();
        //This number can have a decimal
        price2 = secondNo * price2;
        //Ask how much does item 3 "Third" cost
        out.println("How much does one " + Third + " cost?");
        //This number can have a decimal
        float price3 = keyboard.nextFloat();

        price3 = thirdNo * price3;
        //Print Calculating message
        out.println("Calculating your grocery bill.\n");
        //Add total prices together
        float total;
        total = price1 + price2 + price3;
        //Print message of total
        out.println("Your total cost is " + total + ".");

    }
}
