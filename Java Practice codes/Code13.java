/*
 * Write a program to check if a given number is prime or
not.
 */

package FlowControlStatements;
import java.util.Scanner;

public class Code13 
{
	public static void main(String[] args)
	{
		Scanner obj= new Scanner(System.in);
		int num,count=0;
		num=obj.nextInt();
		obj.close();
		for(int i=2 ; i<num/2 ; i++)
		{
			if(num%2==0)
			{
				count++;
			}
		}	
			if(count==0)
			{
				System.out.println(num+" is Prime number");
			}
			else
			{
				System.out.println(num+" is Not a Prime number");	
			}
		}
}	