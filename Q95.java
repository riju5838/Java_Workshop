

class cylinder{
    cylinder(int a){
        System.out.println("I am a constructor"+a);
        }
        public int getradius(){
            return a;
        }
}
   
   
        
  /*  public int getradius(){
        return radius;
    }
    public void setradius(int r){
        radius=r;
    }
    public int getheight(){
        return height;
    }
    public void setheight(int h){
        height=h;
    }
}   */

class user extends cylinder{
    user(int a,int b){
        super(a);
        System.out.printf("i am a constructor of user"+b);
    }
}

   /* public double getvolume(){
        return radius*radius*Math.PI*height;
}
public void setvolume(double vol){
        volume=vol;
}
}   */


public class Q95 {
  
   /*De.setname("riju");
    De.setId(45);
    System.out.println(De.getname());
    System.out.println(De.getId());*/
 public static void main(String[] args) {
     //cylinder riju=new cylinder(0);
     user b=new user(7,8);

   /* riju.setradius(10);
     System.out.println(riju.getradius());
     riju.setheight(8);
    System.out.println(riju.getheight());
    volume me=new volume();
    
    System.out.println(me.getvolume());
 }  */
}  
} 

