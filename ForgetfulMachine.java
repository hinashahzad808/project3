import java.util.Scanner;


public class ForgetfulMachine {
   public static void main(String[] args)
   {
	   Scanner keyboard = new Scanner(System.in);
	   
	   System.out.println("Give me a word!");
	   String first_word=keyboard.next();
	   
	   System.out.println("Give me a Second word!");
	   String second_word=keyboard.next();
	   
	   System.out.println("Great, now your favourite number");
	   int first_number=keyboard.nextInt();
	   
	   System.out.println("And your Second-favourite number........");
	   int second_number=keyboard.nextInt();
	   
	   System.out.println("Whew! wasn't that fun?");
   }
}
