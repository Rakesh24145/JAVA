class DemoVariables
{
  static int a=10;
  int b=20;
  static void m1()
  {
    System.out.println("====static m1()====");
    System.out.println("the value of a= "+a);
    //System.out.println("the value of b="+b);
  }
  void m2()
  {
    System.out.println("====instance m2()====");
    System.out.println("The Value of a= "+a);
    System.out.println("The value of b= "+b);
  }
   public static void main (String []args)
   {
     int c =30;
     DemoVariables.m1();
     DemoVariables ob =new DemoVariables();
     ob.m2();
   } 
}
