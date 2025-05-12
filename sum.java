import java.util.*;

 class sum
{
   int x,y,z;
Scanner in = new Scanner(System.in);
void input()
{
   System.out.println("enter the 2nos");
x=in.nextInt();
y=in.nextInt();
}
  void process()
{
  z=x+y;
}
void show()
{
  System.out.println("sum="+z);
}
}
  class sum
 {
   public static void main(String arg[])
{
   sum obj = new sum();
   obj.input();
   obj.process();
   obj.show();
}
}