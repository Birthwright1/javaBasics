package teamp; // I know this was a type o but was lazy to go back and change teamp to temp. 
               // it's only for testing purpose. 
import java.util.*;

public class averageTemp {

	public static void main(String[] args) {
		// Create scanner class object
        Scanner in = new Scanner(System.in);
        
		int ny=60; // new York average temp
		int lax=80; // LA average temp
		
		System.out.println("The average temp in N.Y. is --> " +ny);
		System.out.println("The average temp in LAX is --> " +lax);
	
		// create One string 
				String title = "Weather";
				System.out.println("Below we will average out the temperature for NY and LAX to determine which city is best for you regarding the "+title);
				
				// Input two numbers from user. 
		        System.out.println("Enter first Temperature number preference :");
		        int num1 = in.nextInt();
		        System.out.println("Enter second Temperature number preference :");
		        int num2 = in.nextInt();
		        
		// Perform arithmetic addition operations.
		        int sum 		= num1 + num2;
		        // Print result to console.
		        System.out.println("The Sum combined total for both cities =  : "         + sum);
		        
	    // Perform arithmetic add and divide for average between both cities. 
		        System.out.println("Based up on your inputs both cities averaged out to be: " + (num1 + num2) / 2 );
		        
			    
	}

}
