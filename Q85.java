package extra_question;
import java.util.*;
public class Q85{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose(0)-rock,choose(1)-scissor,choose(2)-paper");
        int user=sc.nextInt();
        System.out.println("choose(0)-rock,choose(1)-scissor,choose(2)-paper");
        int comp=sc.nextInt();
        if(user==comp)
        {
            System.out.println("tie");
        }
        switch(user){
            case 0:
            if(comp==1){
                System.out.println("you win");}
            else{
                    System.out.println("comp wins");
                }
                break;

                case 1:
                if(comp==2){
                    System.out.println("you win");}
                    else{
                        System.out.println("comp wins");
                    }
                    break;
                case 2:
                if(comp==0){
                    System.out.println("you win");}
                   else{
                       System.out.println("comp wins");
                   }

                
                
                
                }              

            }
        }

   