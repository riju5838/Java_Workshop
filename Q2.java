package Assignment_5;

import javax.lang.model.util.ElementScanner14;

public class Q2 {
    public static void main(String[]args){
int i=1,n;
n=Integer.parseInt(args[0]);
while(i<=n)
{
    if(i%10==1 && i%100!=11)
    System.out.println(i+"st hellow");
    else if(i%10==2 && i%100!=12)
    System.out.println(i+"nd hellow");
    else if(i%10==3 && i%100!=13)
    System.out.println(i+"rd hellow");
    else
    System.out.println(i+"th hellow");
    i++;
}
 
  }
    
}
