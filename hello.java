import java.util.Scanner;
 class hello {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
    //    System.out.println("enter x,y");
    //     double x=sc.nextDouble();
    //     double y=sc.nextDouble();
    //     if(x==0)
    //     System.out.println("("+x+","+y+") is on y axis");
    //     else if(y==0)
    //      System.out.println("("+x+","+y+") is on x axis");
    //     else if(x>0 && y>0)
    //      System.out.println("("+x+","+y+")is on 1st quad"); 

    //     else if(x<0 && y>0)
    //      System.out.println("("+x+","+y+")is on 2nd quad");

    //     else if(x<0 && y<0)
    //     System.out.println("("+x+","+y+")is on 3rd quad"); 
       
    //     else if(x>0 && y<0)
    //     System.out.println("("+x+","+y+")is on 4th quad"); 
       
    //     else  
    //     System.out.println("("+x+","+y+") is at center");
 int number=sc.nextInt();
 System.out.println("number");
    int n=5;
    int y=7;
    switch(number){
        case 1:System.out.println(n+y);
        break;
        case 2:System.out.println(n/y);
        break;
        case 3:System.out.println(n-y);
        break;
        default:System.out.println("none");
    }

       
       
    }
}






       