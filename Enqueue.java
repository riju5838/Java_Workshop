public class Enqueue {
    public static void main(String[] args) {
        QUEUE q=new QUEUE();
        q.enQUEUE(5);
         q.enQUEUE(6);
      q.enQUEUE(61);
        q.enQUEUE(89);
        q.enQUEUE(56);
     

        q.deQUEUE();
        q.deQUEUE();

        q.enQUEUE(15);
        q.enQUEUE(25);
        q.enQUEUE(65);
      System.out.println(q.isFull());
       System.out.println(q.isEmpty());
       System.out.println("size"+q.getsize());

        q.show();
    }
}
