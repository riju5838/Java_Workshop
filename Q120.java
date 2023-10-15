package sem_2;

import java.util.*;

public class Q120 {
    



    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,x,sum=0;
        System.out.println("enter number between 0 and 1000");
        n=sc.nextInt();
{
        while(n>0){
            r=n%10;
        sum=sum+r;
        n=n/10;

    }
        System.out.println("sum digit"+sum);
    }
    
}
}
