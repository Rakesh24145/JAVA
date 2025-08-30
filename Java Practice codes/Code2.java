/*
 * Given two non-negative int values, print true if they have the same last digit,
 * such as with 27 and 57.
 * lastDigit(7,17) -> true
 * lastDigit(6,17)->falls
 * lastDigit(3,113)->true
 */

package FlowControlStatements;
import java.util.Scanner;

public class Code2 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		int num1;
		int num2;
		int digit1,digit2;
		num1=obj.nextInt();
		num2=obj.nextInt();
		digit1=num1%10;
		digit2=num2%10;
		obj.close();
		if(digit1==digit2)
		{
			System.out.print("lastDigit ("+num1+" , "+num2+")-> true");
		}
		else
			System.out.print("lastDigit ("+num1+" , "+num2+")-> falls");
	}
}
