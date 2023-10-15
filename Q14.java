package Assignment_4;
import java.util.*;

public class Q14 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        int n=sc.nextInt();
        int a;
        int sum=0;

        while(n>0)
        {
            a=n%10;
            System.out.println();
            sum=sum+a;
            n=n/10;
            }
            System.out.println();
            if(sum%9==0)
            System.out.println("divisible");
            else
           {System.out.println("not divisible");
        }
    }

    
}
