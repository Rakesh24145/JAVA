
import java.util.Scanner;
class check
{
	int Even(int x)
	{
		int n1=0;
		if(n1%2==0)
		{
			
		}
		return n1;
	}
}
public class Program1 
{
  public static void main(String [] args)
  {
	  Scanner obj = new Scanner(System.in);
	  System.out.println("Enter a Number To Check");
	  int num=obj.nextInt();
	  obj.close();
	  check s1 = new check();
	  int h1=s1.Even(num);
	  System.out.println("Result is "+h1);
  }
}