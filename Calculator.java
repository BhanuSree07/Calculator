import java.util.Scanner;
public class Calculator
{
	private Calculator(String name) 
	{
	// This constructor has one parameter, name.
	System.out.println("Operation:" + name );
	}
	
	public static void main(String args[])
	{
	Calculator calci = new Calculator("Calculator");

	int x,y;
	

	Scanner scanner = new Scanner(System.in);	
	System.out.println("Enter the two numbers:");
	x = scanner.nextInt();
	y = scanner.nextInt();

	int add = x + y;
	int sub = x - y;
        float div = x / y;

	System.out.println("Sum ="+add);
	System.out.println("Difference ="+sub);
	System.out.println("Divide ="+div);

	}
}