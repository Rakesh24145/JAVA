/*
 *  Initialize a character variable with an alphabhet in a
program.
If the character value is in lowercase, the output should
be displayed in uppercase in the following format.
Example1)
i/p:a
o/p:a->A
If the character value is in uppercase, the output should
be displayed in lowercase in the following format.
If Statement
Example2)
i/p:A
o/p:A->a
 */

package FlowControlStatements;
import java.util.Scanner;

public class Code8 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		char ch=obj.next().charAt(0);
		obj.close();
		if(Character.isLowerCase(ch))
		{
			System.out.println(ch + "->" +Character.toUpperCase(ch));
		}
		else
		{
			System.out.println(ch + "->" +Character.toLowerCase(ch));
		}
	}

}
