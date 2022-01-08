package JAVA13;
//hw13_15,
import java.io.*;
import java.math.*;
class ArgumentOutOfBound extends Exception
{ }
public class hw13_15
{
public static void main(String args[]) throws IOException
{
   BufferedReader buf;
   String str;
   int num;

   buf=new BufferedReader(new InputStreamReader(System.in));
   System.out.print("�п�J�j��0�����:");
   str=buf.readLine();
   num=Integer.parseInt(str);
   mySqrt(num);
}

public static void mySqrt(int n)
{
   try
   {
      if(n<0)
         throw new ArgumentOutOfBound();
      else
      {
         System.out.println("sqrt("+n+")="+Math.sqrt(n));
      }
   }
   catch(ArgumentOutOfBound e)
   {
      System.out.println(n+"�p��0");
   }
}
}

/* output---------------
�п�J�j��0�����:81
sqrt(81)=9.0
----------------------*/
