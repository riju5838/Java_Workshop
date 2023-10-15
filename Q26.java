import java.util.*;
public class Q26 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter weight in pound and height in meters");
        double weight=sc.nextDouble();
        double height=sc.nextDouble();
        double BMI=(weight*0.45359237)/(Math.pow(height,2)*0.0254);
    System.out.println("BMI"+BMI);
}

    
}
