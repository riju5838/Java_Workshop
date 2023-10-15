package Assignment_5;

public class Q8 {
    public static void main(String[]args){
        double a = Integer.parseInt(args[0]);
            double b = Integer.parseInt(args[1]);
            double c1 = a + ((b-a)*Math.random());
            double c2 = a + ((b-a)*Math.random());
            double c3 = a + ((b-a)*Math.random());
            double c4 = a + ((b-a)*Math.random());
            double c5 = a + ((b-a)*Math.random());
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4);
            System.out.println(c5);
            System.out.println("The average value = " + ((c1+c2+c3+c4+c5)/5));
    }
}
