import java.util.Scanner;
public class prime_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int n=sc.nextInt();
            for(int d=2;d<=(n-1);d++){
           if (n%d==0){
             System.out.print("the number "+n+" is a composite number.");
             break;
           }
           else{
             System.out.print("the number "+n+" is a prime number.");
             break;
           }
            }
            
        }

    }
    

