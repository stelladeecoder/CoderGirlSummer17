
/**
 * Write a description of class MultiplyTable here.
 * This Program will print the multiplication tables in a grid format no bigger than 20.
 * @author (Delores Carey)
 * @version (Aug 28, 2017)
 */
import static java.lang.System.out;
import java.util.Scanner;

public class MutliplicationTableGrid
{ 
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        // print "Welcome to Multiplication Tables
        System.out.println("Welcome to Multiplication Tables");
        // ask user How large would you like to see them? 
        System.out.println ("How large would you like to see them?");
        //number should be no larger than 20 
        int tableSize = input.nextInt();

        if (tableSize<=20) 
        {
            printMultiplicationTable(tableSize);
        } else 
        {           out.println("Please  enter number less than 20");
            System.out.println("");
        }
    }

    public static void printMultiplicationTable(int tableSize)
    {
        System.out.format("     ");
        for(int x = 0; x <= tableSize;x++ ) 
        {
            System.out.format("%4d",x);
        }
        System.out.println();

        for(int x = 0 ;x  <= tableSize;x++) 
        {

            System.out.format("%4d ",x);
            for(int y=0;y <= tableSize;y++) 
            {
                System.out.format("%4d",x*y);
            }
            System.out.println();
        }
    }
}