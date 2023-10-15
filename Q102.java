interface Bicycle{
    void breaking(int decrement);
    void speedup(int incremint);
}
class b1 implements Bicycle{
    public void breaking(int decrement){
        System.out.println("applying breaking");
    }
    public void speedup(int decrements){
        System.out.println("speeding up");
    }
}
public class Q102 {
    public static void main(String[] args) {
        b1 a=new b1();
        a.breaking(5);
        a.speedup(6);
    }
}
