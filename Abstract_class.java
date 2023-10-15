package Code_with_Harry;
abstract class parent2{
    public parent2(){
        System.out.println("constructor");
    }

public void sayHellow(){
    System.out.println("hellow");
}
abstract public void greet();

class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("good morning");

    }
}
public class Abstract_class {
    public static void main(String[] args){
        child2 riju= new child2();
     riju.greet();   
        
       
} 
}
}

