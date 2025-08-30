/*
 * Write a program to print the sum of all the digits of a
given number.
Example1)
I/P:1234
O/P:10
 */

package FlowControlStatements;
import java.util.Scanner;
public class Code15 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int n,sum;
		System.out.print("Enter the number: ");
		n=obj.nextInt();
		obj.close();
		for( sum=0; n!=0; n=n/10)
			sum=sum+(n%10);
		System.out.print(sum);
	}
}
