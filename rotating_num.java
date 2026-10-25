import java.util.Scanner;
public class rotating_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ones place digit");
        int o=sc.nextInt();
        System.out.println("enter the tens place digit");
        int t=sc.nextInt();
        System.out.println("enter the hundreds place digit");
        int h=sc.nextInt();
        System.out.print("the new number is "+h+t+o);
    }
}
