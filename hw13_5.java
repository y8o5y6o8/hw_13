package JAVA13;
//hw13_5,
public class hw13_5
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
   catch(ArithmeticException e)
   {
      System.out.println("���Ƭ� 0");
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
      System.out.println("�}�C���жW�X�F�d��");
   }
}
}

/* output---------------
ans=1
���Ƭ� 0
----------------------*/
