import java.util.Scanner;
class Return 
{
    public static Boolean isEven(int n)
  {
       if((n&1)==0)
       return true;
       else
       return false;
  }
  Class EvenOdd;
  public static void main(String []args)
  {
    int n=0;
    if(isEven(n)==true)
    System.out.println("Enter number is Even");
    else
    System.out.println("Enter number is Odd");
  }  
}