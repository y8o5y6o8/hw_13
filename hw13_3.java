package JAVA13;
//hw13_3,
public class hw13_3
{
public static void main(String args[])
{
   try
   {
      int num=12,den=0;
      int ans=num/den;
      System.out.println("ans="+ans);
   }
   catch(ArithmeticException e)
   {
      System.out.println("°£¼Æ¬° 0");
   }
   finally
   {
      System.out.println("end of main() method!!");
   }
}
}

/* output---------------
°£¼Æ¬° 0
end of main() method!!
----------------------*/
