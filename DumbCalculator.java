import java.util.Scanner;


public class DumbCalculator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is your first number?");
		float first_number=input.nextFloat();
		
		System.out.print("What is your second number?");
		float second_number=input.nextFloat();

		System.out.print("What is your third number?");
		float third_number=input.nextFloat();
		
		float average = (first_number+second_number+third_number) / 2;
		
		System.out.println("\nThe average of floating point numbers is "+average);

	}

}
