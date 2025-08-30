/*
 * Write a program to check if the program has received
command line arguments or not.
If the program has not received arguments then print "No
Values", else print all the values in a single line
separated by ,(comma)
Example1) java Example
O/P: No values
Example2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore
[Hint: You can use length property of an array to check its
length]
 */

package FlowControlStatements;

public class Code4 
{
	public static void main(String[] args)
	{
		int a=args.length;
		if(a==0)
		{
			System.out.print("No values");
		}
		else
		{
			System.out.print(args[0]);
			for(int i=1; i<a; i++)
			{
				System.out.print(","+args[i]);
			}
		}
	}
}
/*public static void main(String[] args)
{
	int a=args.length;
	if(a==0)
	{
		System.out.print("No values");
	}
	else
	{
		System.out.print(args[0]+","+args[1]);
	}
}*/