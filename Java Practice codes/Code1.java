/*
 *  Write a program to check if a given integer number is
Positive, Negative, or Zero.
 */
package FlowControlStatements;
import java.util.Scanner;
public class Code1 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int num;
		num=obj.nextInt();
		obj.close();
		if(num>0)
		{
			System.out.print(+num+ " is positive");
		}
		else if(num<0)
		{
			System.out.print(+num+ " is negative");
		}
		else if(num==0)
		{
			System.out.print(+num+ " is zeo");
		}
	}

}
