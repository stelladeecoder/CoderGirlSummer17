import static java.lang.System.out; 
import java.util.Scanner; 

public class SandwichShop 
{     public static void main(String[] args)     
    {         
        // Don't change these lines.         
        Scanner keyboard = new Scanner(System.in);         
        int goalForVeggies = 50;         
        int goalForBurgers = 250;         
        int goalForSubs = 180;         
        int goalForSoup = 70; 

        // Your code goes below here. 
        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwiches were sold today?");
        int veggiesSold;
        veggiesSold = keyboard.nextInt();
        
        out.print("\n");
        if (veggiesSold >= goalForVeggies)
        {
            out.println("Made goal for veggies. ");
        }
        else
        {
            out.println("Fell short for burgers. ");
        }
        
        out.println("The sales goal for burgers is 250");
        out.println("How many burgers were sold today?");
        int burgersSold;
        burgersSold = keyboard.nextInt();
        out.print("\n");
        
        if (burgersSold >= goalForBurgers)
        { 
            out.println("Made goal for burgers. ");
        }
        else
        {
            out.println("Fell short for burgers. ");
        }
        
        out.println("The sales goal for subs is 180");
        out.println("How many burgers were sold today");
        int subsSold;
        subsSold = keyboard.nextInt();
        out.print("\n");
               
        if (subsSold >= goalForSubs)
        { 
            out.println("Made goal for subs. ");
        }
        else
        {
            out.println("Fell short for subs. ");
        }
        
        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold today?");
        int soupsSold;
        soupsSold = keyboard.nextInt();
        
        out.print("\n");
        if (soupsSold >= goalForSoup)
        {
            out.println("Made goal for soup. \n");
        }
        else 
        {
            out.println("Fell short for soup. \n");
        }
        
        if (soupsSold >= goalForSoup && subsSold >= goalForSubs && burgersSold 
        >= goalForBurgers && veggiesSold >= goalForVeggies)
        {
            out.println("Made goal for everything!");
        }
        else
        {
        }
    }   
}  