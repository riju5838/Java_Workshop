package Code_with_Harry;
import java.util.Random;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
class Game{
    int number;
    int inputNumber;
      int noofguesses=0;
   
    public int getnoofguessess(){
        int noofguessess;
        return noofguessess;
    }
    public void setnoofguessess(int noofguessess){
        this.noofguessess=noofguessess;

    }
    Game(){
        Random rand=new Random();
        this.number=rand.nextInt();
    }
    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();}
        boolean iscorrectNumber(){
            no of guessess;
            if(inputNumber==number){
                return true;
            }
            elseif(inputNumber>number){
                System.out.println("too less");
            }
            elseif(inputNumber<number){
                System.out.println("too high");
            }
            else{
                return false;
            }
        }
}
public class Q101 {
    public static void main(String[] args) {
        Game g=new Game();
        g.takeuserinput();
        boolean b=g.iscorrectNumber();
    }
    System.out.println(b);
}
