package Code_with_Harry;
interface train{
    void speed();
    private void greet(){
        System.out.println("morning");}
    default void riju(){
        greet();
        System.out.println("good");
}
class tour{
    void roaming(){
        System.out.println("touring");}
       

            
        

    }
}
class tour1 extends tour implements train{
   public void run(){
        System.out.println("high speed");
    }
 
   public void speed(){
        System.out.println("speeding");
    }
}
public class Q103 {
    public static void main(String[] args) {
        tour1 t=new tour1();
        t.riju();
        t.run();
    }
}
