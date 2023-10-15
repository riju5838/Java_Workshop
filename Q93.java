package sem_2;
//using getters and setters;
class Employee{
    String name;
    int Id;
    public String getname(){
        return name;
    }
    public void setname(String n){
        name= n;
    }
    public int getId(){
        return Id;
    }
    public void setId(int I){
        Id=I;
    }
    
}

/*
class square{
int side;
public  int area(){
    return side*side;

}
public int perimeter(){
    return 4*(side);
}
}*/
  

public class Q93 {
    public static void main(String[] args) {
     /* square r=new square();
       r.side=5;
       System.out.println(r.area());
       System.out.println(r.perimeter());
    }*/
    Employee De=new Employee();
    De.setname("riju");
    De.setId(45);
    System.out.println(De.getname());
    System.out.println(De.getId());
}  
}
