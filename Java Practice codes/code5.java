/*
 * Initialize two character variables in a program and
display the characters in alphabetical order.
Example1) if the first character is 's' and second
character is 'e' then the output should be e,s
Example2) if the first character is 'a' and second
character is 'e', then the output should be a,e
 */

package FlowControlStatements;
import java.util.Scanner;
public class code5 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		char ch1=obj.next().charAt(0);
		char ch2=obj.next().charAt(0);
		obj.close();
		if(ch1>ch2)
		{
			System.out.print(ch2+","+ch1);
		}
		else
		{
			System.out.print(ch1+","+ch2);
		}
	}

}
