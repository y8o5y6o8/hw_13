package JAVA13;
//hw13_12,
class NotTriangleException extends Exception
{ }
class EquilateralTriangle extends Exception
{ }
class NotEquilateralTriangle extends Exception
{ }

public class hw13_12
{
public static void main(String args[])
{
   int a=5;
   int b=5;
   int c=5;

   try
   {
      System.out.println("a="+a+", b="+b+", c="+c);
      triangle(a,b,c);
   }
   catch(NotTriangleException e)
   {
      System.out.println("���c���T����");
   }
   catch(EquilateralTriangle e)
   {
      System.out.println("�o�O���T����");
   }
   catch(NotEquilateralTriangle e)
   {
      System.out.println("�o���O���T����");
   }
}
public static void triangle(int a,int b,int c) throws
    NotTriangleException,EquilateralTriangle,NotEquilateralTriangle
{
   if((a+b)<c || (a+c)<b || (b+c)<a)
      throw new NotTriangleException();
   else if(a==b && a==c && b==c)
      throw new EquilateralTriangle();
   else
      throw new NotEquilateralTriangle();
}
}

/* output--------
a=5, b=5, c=5
�o�O���T����
---------------*/
