import java.util.Scanner;


public class BMICalculator {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Your height in m:");
		    float height=input.nextFloat();

		System.out.print("Your weight in kg:");
		   float weight=input.nextFloat();
		   float height_in_square = height*height;
		
		System.out.println("\nYour BMI is "+ weight / height_in_square);
		
		System.out.print("\nYour height in inches:");
		  double height_in_inches=input.nextDouble();

		System.out.print("Your weight in pounds:");
		double weight_in_pounds=input.nextDouble();
		
		double pound_to_kg = weight_in_pounds * ( 1 / 2.2 );
		 
		double inches_to_meter = height_in_inches * 0.02540;
		 
		double inches_in_square= inches_to_meter * inches_to_meter;
		
		System.out.print("\nYour BMI is "+pound_to_kg / inches_in_square);
		
		System.out.print("\nYour height (feet only):");
		  double height_in_feet=input.nextDouble();
		  
		  System.out.print("\nYour height (inches):");
		  double inches=input.nextDouble();

		System.out.print("\nYour weight in pounds:");
		double weight_pounds=input.nextDouble();
		
		double feet_to_meter = height_in_feet * 0.3048;
		double inches_in_meter = inches * 0.02540;
		double add = feet_to_meter + inches_in_meter;
		double square = add * add;
		double pounds_to_kgs = weight_pounds * ( 1 / 2.2 );
		
		System.out.print("\nYour BMI is "+ pounds_to_kgs / square);
		
	}

}
