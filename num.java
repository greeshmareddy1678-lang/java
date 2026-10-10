import java.util.Scanner;
public class num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("it is a even number");
        else
            System.out.println("it is a odd number");
    }
}