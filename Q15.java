import java.util.*;
public class Q15 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("today day");
    int day=sc.nextInt();
    System.out.println("day elapsed");
    int dayelapsed=sc.nextInt();
    
    int futureday=(day+dayelapsed)%7;
    System.out.println("today is");
    switch(futureday)
    {
        case 1:System.out.println("sunday");break;
        case 2:System.out.println("monday");break;
        case 3:System.out.println("tuesday");break;
        case 4:System.out.println("wednesday");break;
        case 5:System.out.println("thrusday");break;
        case 6:System.out.println("friday");break;
        case 7:System.out.println("saturday");

    }
}    
}
