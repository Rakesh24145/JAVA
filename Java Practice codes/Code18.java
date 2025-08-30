/*
 * Write a Java program to find if the given number is
palindrome or not
Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome
Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
 */

package FlowControlStatements;

import java.util.Scanner;

public class Code18 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int number,div,rev=0,x;
		number=obj.nextInt();
		x=number;
		obj.close();
		while(number!=0)
		{
			div = number%10;
			rev=rev*10+div;
			number=number/10;
		}
		if(x==rev)
		{
			System.out.print(x+ " is palindrome");
		}
		else
		{
			System.out.print(x+" is not palindrome");
		}
	}

}
