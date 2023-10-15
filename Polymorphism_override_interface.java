package sem_2;
interface LaptopDetails{
    void wifi(int speed);
    void Storage(int ram);
    void Brand(String Brand);
}
interface MobileDetails{
    void wifi1(int speed);
    void Storage1(int ram);
    void Brand_1 (String Brand1);
}
interface tablets{
    void wifi2(int speed);
    void Storage2(int ram);
    void Brand_2 (String Brand2);
}
class MyShop{
    public void Dealers_name(String name){
        System.out.println("Dealers name="+name);
    }
    public void Address(String Address){
        System.out.println("Address="+Address);
    }
}
class MyShop1 extends MyShop implements LaptopDetails, MobileDetails,tablets{
    
    
    @Override
    public void wifi2(int speed) {
       
        System.out.println("wifi2="+speed);
    }

    @Override
    public void Storage2(int ram) {
    
        System.out.println("Storage2="+ram);
    }

    @Override
    public void Brand_2(String Brand2) {
        
        System.out.println(" Brand_2="+Brand2);
    }

    @Override
    public void wifi1(int speed) {
       
        System.out.println("wifi1="+speed+"mbps");
    }

    @Override
    public void Storage1(int ram) {
      
        System.out.println("Storage1="+ram+"GB");
    }

    @Override
    public void Brand_1(String Brand1) {
      
        System.out.println("Brand_1="+Brand1);
    }

    @Override
    public void wifi(int speed) {
      
        System.out.println("wifi="+speed+"mbps");
    }

    @Override
    public void Storage(int ram) {
        
        System.out.println("Storage="+ram+"GB");
    }

    @Override
    public void Brand(String Brand) {
        
        System.out.println("Brand="+Brand);
    }
   
}

public class Polymorphism_override_interface {
    public static void main(String[] args) {
         MyShop ob=new MyShop();
         LaptopDetails obj=new MyShop1();
         MobileDetails M1=new MyShop1();
            ob.Dealers_name("kallu bhai");
            System.out.println("");
            ob.Address("Asansol");
            System.out.println("");
            obj.wifi(25);
            System.out.println("");
            obj.Storage(256);
            System.out.println("");
            obj.Brand("Dell");
           M1.wifi1(100);
           M1.Storage1(512);
           M1.Brand_1 ("Oppo");
}
        
    }

