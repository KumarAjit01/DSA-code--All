import java .util.*;
class hello
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println("enter course name");
        String course=sc.next();
        System.out.println("enter the roll no");
        int roll =sc.nextInt();
        System.out.println("enter marks of subject 1");
        int m1 =sc.nextInt();
        System.out.println("enter marks of subject 2");
        int m2 =sc.nextInt();
        System.out.println("name="+name);
        System.out.println("course="+course);
        System.out.println("roll="+roll);
        System.out.println("subject1 marks="+m1);
        System.out.println("subject2 marks="+m2);


    }

}