package JAVA13;
//hw13_6,
public class hw13_6
{
public static void main(String args[])
{
   try
   {
      int num=12;
      int den[]={12,0,3,0,0,4};
      for(int i=0;i<10;i++)
         System.out.println("ans="+num/den[i]);
   }
   catch(Exception e)
   {
      System.out.println("捕捉到例外了");
   }
}
}

/* output---------------
ans=1
捕捉到例外了
----------------------*/
