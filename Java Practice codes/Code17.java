/*
 * Write a program to reverse a given number and print
Example1)
I/P: 1234
O/P:4321
Example2)
I/P:1004
O/P:4001
 */

package FlowControlStatements;
import java.util.Scanner;

public class Code17 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int num,div,rev=0,x;
		num=obj.nextInt();
		x=num;
		obj.close();
		while( num!=0 )
		{
			div=num%10;
			rev=rev*10+div;
			num=num/10;
		}
		System.out.print("After reverse "+x+" is " +rev);
	}

}
