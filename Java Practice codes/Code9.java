/*
 * Write a program to receive a color code from the user (an
Alphabhet).
The program should then print the color name, based on the
color code given.
The following are the color codes and their corresponding
color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
If color code provided by the user is not valid then print
"Invalid Code". 

 */

package FlowControlStatements;
import java.util.Scanner;
public class Code9 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		char ColourCode=obj.next().charAt(0);
		obj.close();
		switch(ColourCode)
		{ 
		case 'R':
		{
			System.out.println("R -> Red");
			break;
		}
		case 'B':
		{
			System.out.println("B -> Blue");
			break;
		}
		case 'G':
		{
			System.out.println("G -> Green");
			break;
		}
		case 'O':
		{
			System.out.println("O -> Orane");
			break;
		}
		case 'Y':
		{
			System.out.println("Y -> Yellow");
			break;
		}
		case 'W':
		{
			System.out.println("W -> White");
			break;
		}
		default:
		{
			System.out.println("Invalid code!!!!");
		}
		}
	}
}		
		