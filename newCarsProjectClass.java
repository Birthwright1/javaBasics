package newCarsProjectPackage;
import java.util.ArrayList;
public class newCarsProjectClass {
	
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Toyota");
	    System.out.println(cars);	 
	    cars.remove(0);
	    cars.remove(1);
	    cars.remove(2);
	    System.out.print(cars);
	}
	
}
