package arr;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) 
	{
		int x , sum = 0, temp;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		temp = n;
		while (n > 0) 
			{
			x = n % 10; 
			sum = (sum * 10) + x;
			n = n / 10;
			}
	if (temp == sum)
			System.out.println("Given number is palindrome number ");
		else
			System.out.println("Given number is not palindrome");
	}
}