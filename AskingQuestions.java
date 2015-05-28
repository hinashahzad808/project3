import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		int height_in_feet;
		int height_in_inches;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		height_in_feet = keyboard.nextInt();
		
		System.out.print( "And how many inches? " );
		height_in_inches = keyboard.nextInt();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + height_in_feet + "'"+height_in_inches +"\" tall and " + weight + " heavy." );
	}
}
