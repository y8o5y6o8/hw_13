package JAVA13;
//hw13_8,
class Ctest
{
public static void test(int num,int den) throws ArithmeticException
{
   System.out.println(num+"/"+den+"="+num/den);
}
}

public class hw13_8
{
public static void main(String args[])
{
  try
  {
     Ctest.test(5,0);
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

/* output----------------
°£¼Æ¬° 0
end of main() method!!
-----------------------*/
