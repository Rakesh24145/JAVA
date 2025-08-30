/*
 *  Write a program to check if a given integer number is odd
or even.

 */

package FlowControlStatements;
import java.util.Scanner;

public class Code3 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int num;
		num=obj.nextInt();
		obj.close();
		if(num%2==0)
		{
			System.out.print("Given number is Even");
		}
		else
		{
			System.out.print("Given number is Odd");
		}
		
	}

}
