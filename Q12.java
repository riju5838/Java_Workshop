package sem_2;
import java.util.Scanner;
public class Q12 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values=");
    double radius=sc.nextDouble();
    double length=sc.nextDouble();
    double area=Math.pow(radius,2);
    double volume=area*length;
  System.out.println("area="+area+"volume="+volume);
    }
}
