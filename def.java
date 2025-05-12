import java.util.*;
 class def {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first value");
        int a = sc.nextInt();
        System.out.println("enter your second value");
        int b = sc.nextInt();
        
        System.out.println("please calcute as your choice");

        int operator = sc.nextInt();
        
        switch(operator) {
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
        }
        sc.close();
        

    }
}