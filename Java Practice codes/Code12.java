/*
 * Write a program to print even numbers between 23 and 57.
Each number should be printed in a separate row.
 */

package FlowControlStatements;

public class Code12 
{
	public static void main(String[] args)
	{
		for(int i=23; i<=57; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
