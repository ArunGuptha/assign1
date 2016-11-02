package arr;
import java.util.Scanner;
 
public class Palindrome1 { 
public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
 System.out.println("Enter a string");
 String str=in.nextLine();
 
 StringBuffer str1=new StringBuffer(str);
 StringBuffer str2=new StringBuffer(str1);
 
  str1.reverse();

 
 if(String.valueOf(str1).compareTo(String.valueOf(str2))==0)
   System.out.println("Result:Palindrome");
    else
    System.out.println("Result:Not Palindrome");
 
    }
}