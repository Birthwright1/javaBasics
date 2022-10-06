package multiplyNum;
import java.util.Scanner;

public class multiplynumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		  System.out.println("Input the Number: ");
		  int n = in .nextInt();
		  for (int i = 1; i <= 10; i++) {
		   System.out.println(n + "*" + i + " = " + (n * i));
		  }
	}
}