/*
 * Write a program to print * in Floyds format (using for and
while loop)
*
* *
* * *
Example1)
C:\>java Sample
O/P: Please enter an integer number
For Loop
Example2)
C:\>java Sample 3
O/P :
*
* *
* * *
 */

package FlowControlStatements;

public class Code16 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1; j<=i; j++)
			{
			System.out.print(" *");
			}
			System.out.println(" ");
		}
		
	}

}
