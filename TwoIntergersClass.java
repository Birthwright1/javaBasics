package TwoIntergersPackage;
import java.util.*;
public class TwoIntergersClass {

	public static void main(String[] args) {
		
		 // Create scanner class object
        Scanner in = new Scanner(System.in);

     // create One string 
		String title = "Calculator";
		System.out.println("This is my one String and it is called "+title);
		
		// Input two numbers from user
        System.out.println("Enter first Interger for Class :");
        int num1 = in.nextInt();
        System.out.println("Enter second Interger for Class :");
        int num2 = in.nextInt();
        
        
     // Print result to console.
        System.out.println("First Number" +num1);
        System.out.println("Second Number" +num2);
        
        
		char operator;
	    Double number1, number2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	}
	    input.close();
	}
}
