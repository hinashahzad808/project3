import java.util.Scanner;


public class UserInput {
	public static void main(String[] args) 
	{
		 Scanner keyboard = new Scanner(System.in);
		 
		    String first_name;
		    String last_name;
		    int grade;
		    int student_id;
		    String login;
		    String gpa;

			System.out.println( "Please enter the following information so I can sell it for a profit! " );
			
			System.out.print( "First Name:" );
			first_name=keyboard.next();
			
			System.out.print( "Last Name:" );
			last_name=keyboard.next();
			
			System.out.print( "Grade (9-12):" );
			grade=keyboard.nextInt();
			
			System.out.print( "Student ID:" );
			student_id=keyboard.nextInt();
			
			System.out.print( "Login:" );
			login=keyboard.next();
			
			System.out.print( "GPA (0.0-4.0):" );
			gpa=keyboard.next();
			
			System.out.println( "Your Information:" );
			System.out.println( "           Login:"+login);
			System.out.println( "           ID:"+student_id);
			System.out.println( "           Name:"+first_name);
			System.out.println( "           GPA:"+gpa);
			System.out.println( "           Grade:"+grade);
			
		}
}
