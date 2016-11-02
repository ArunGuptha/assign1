package arun1;
import java.util.Scanner;

public class Fibonacci 
   {
	public static void Fibo() 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int limit = sc.nextInt();
			sc.close();
			long num1 = 0;
			long num2 = 1;
			System.out.print(num1 + ", " + num2);
	
			for (long i = 1; i < limit; i++)
				{
					long next = num1 + num2;
					System.out.print(", " + next);
					num1 = num2;
					num2 = next;
				}
			System.out.println();
		}
	public static void main(String[] args) 
	{
		Fibo();
	}
}
