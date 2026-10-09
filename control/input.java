package control;
import java.util.Scanner;
public class input{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string value");
        String a=sc.nextLine();
        System.out.println("enter a integer value");
        int b=sc.nextInt();
        System.out.println("enter a float value");
        float c=sc.nextFloat();
        System.out.println("the string value is:"+a);
        System.out.println("the integer value is:"+b);
        System.out.println("the float value is:"+c);
    }}