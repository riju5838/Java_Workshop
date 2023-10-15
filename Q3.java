package Assignment_5;

import java.util.*;
public class Q3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String a=sc.nextLine();
        System.out.println("times u want to print");
        
        int n=sc.nextInt();
        int i=1;
        String b;
        while(i<=n)
        { if(i%10==1 && i%100==1)
            {
                b="st";
            }
            else if(i%10==2 && i%100==2)
            {
                b="nd";
}
else if(i%10==3 && i%100==3)
{ 
    b="rd";
}
else
{
    b="th";
}
System.out.println(i+b+a);
        i++;}
    }
    
}
