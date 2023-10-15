package Code_with_Harry;
/*abstract class PEN{
    void write(){

    }
    void refill(){

    }
}
class Foundation_pen extends PEN{
public void changeNib(){
    System.out.println("broken");
}
public void write(){
    System.out.println("writting essay");
}
public void refill(){
    System.out.println("fill refill");
}
} */
interface Basic_Animals{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
class Human extends monkey implements Basic_Animals{
    public void speak(){
        System.out.println("speaking");
    }
    public void eat(){
        System.out.println("eating");
        
        }

    @Override
    public void sleep() {
        System.out.println("sleeping");
        
    }
    } 

public class Q107 {
    public static void main(String[] args) {
       /* Foundation_pen obj=new Foundation_pen();
        obj.changeNib();
        obj.write();
        obj.refill();*/
        Human obj=new  Human();
        obj.sleep(); 
    }
}
