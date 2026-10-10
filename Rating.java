
import java.util.Scanner;
public class Rating{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("rate the movie out of 10");
int a=sc.nextInt();
 switch(a)
{
case 3:case 2:case 1:
    System.out.println("thank you for rating,We hope your future movie expewrience will be better");
    break;
case 6:case 5:case 4:
    System.out.println("thank you for rating,the movie might not be upto your interests");
break;
case 10:case 9:case 8:case 7:
 System.out.println("thank you for rating,the movie must be great!!!");
break;
 default:
 System.out.println("plese retry and enter a valid value");
 break;
}}}