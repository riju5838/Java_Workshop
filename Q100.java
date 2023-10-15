class A{
  
    public void meth1(){
        System.out.println("i am class s");}

    public void meth2(){
        System.out.println("i am class a");
    }
}
class B extends A{
    public void meth2(){
        System.out.println("i am class p");}
    public void meth3(){
        System.out.println("i am class b");
    }
}
    public class Q100 {
    public static void main(String[] args) {
        B a=new B();
       a.meth1();
       a.meth2();
    }
}
