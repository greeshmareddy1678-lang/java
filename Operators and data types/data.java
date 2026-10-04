import java.util.Scanner;
public class data{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double a=sc.nextDouble();
        System.out.println("enter the second number");
        double b=sc.nextDouble();
        //basic calculations
        System.out.println("the sum of the numbers is:"+(a+b));
         System.out.println("the difference of the numbers is:"+(a-b));
          System.out.println("the product of the numbers is:"+(a*b));
           System.out.println("the qotient of the numbers is:"+(a/b));
    }
}