/*
 *  Initialize a character variable in a program and
print 'Alphabhet' if the initialized value is an alphabhet,
print 'Digit' if the initialized value is a number, and
print 'Special Character', if the initialized value is
anything else.

 */

package FlowControlStatements;
import java.util.Scanner;
public class code6 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		char ch=obj.next().charAt(0);
		obj.close();
			if(ch<90 && ch>65 || ch<122 && ch>97)
			{
				System.out.print("Alphabate");
			}
			else if(ch<57 && ch>48)
			{
			      System.out.print("Digit");
			}
			else
			{
				 System.out.print("Other character");
			}
	}
}
