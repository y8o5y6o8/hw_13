package JAVA13;
//hw13_13,
import java.io.*;
class Exception520 extends Exception
{
}

public class hw13_13
{
public static void main(String args[]) throws IOException
{
  try
  {
     String str;
     BufferedReader buf;
     buf=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Input a string:");
     str=buf.readLine();
     if(str.equals("520"))
        throw new Exception520();
     else
        System.out.println("string="+str);
  }
  catch(Exception520 e)
  {
     System.out.println("�o�O�Ѧr��520�Ҥް_���ҥ~");
  }
}
}

/* output------------------
Input a string:520
�o�O�Ѧr��520�Ҥް_���ҥ~
-------------------------*/
