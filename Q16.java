import java.util.*;
public class Q16 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values out of 100");
    int Marks=sc.nextInt();
    switch(Marks/10)
{       case 0:case 1:case 2:case 3: 
System.out.println("F");break;
case 4:
System.out.println("E");break;
case 5:
System.out.println("D");break;
case 6:
System.out.println("C");break;
case 7:
System.out.println("B");break;
case 8:
System.out.println("A");break;
case 9:case 10:
System.out.println("O");break;
case 11:
System.out.println("invalid input10");

}
}
    
}
