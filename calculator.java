import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number");
    int n1=sc.nextInt();
    System.out.println("enter the second number");
    int n2=sc.nextInt();
    System.out.println("enter 1.addition,2.subtraction,3.multiplication,4.division");
    int ch=sc.nextInt();
    switch (ch) {
        case 1:
            System.out.println("Addition"+(n1+n2));
            break;
        case 2:
            System.out.println("Subtraction"+(n1-n2));
            break;
        case 3:
            System.out.println("multiplication"+(n1*n2));
            break;
        case 4:
            System.out.println("division"+(n1/n2));
            break;
        default:
            System.out.println("enter the right choice");
            break;
    }
    }
}
