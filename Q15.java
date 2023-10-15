package extra_question;

public class Q15 {
    static int factorial(int n){
     
    
        if(n==1||n==0){
            return 1;
        }
        else{
        return n*factorial(n-1);
             }
               
    }
    public static void main(String[] args) {
     int n=4;
     System.out.println(factorial(n));
    }
}
