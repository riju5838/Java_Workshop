import java.util.*;


public class STACK {

    int STACK[]=new int[5];
   int top=0;
    public void push(int data){
        if(top==5){
            System.out.println("stack is full");
        }
        else{
        STACK[top]=data;
        top++;}

    }
    public int pop(){
     
        int data=0;
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else{
        top--;
        data=STACK[top];
        STACK[top]=0;}
        return data;
    }
    public int peek(){
        int data;
        top--;
        data=STACK[top-1];
        return data;
    }
    public int size(){
       return top;
    }
    public boolean isEmpty()
    {
        return top<=0;
    }
    public void show(){
        for(int n:STACK){
        System.out.print(n+"   ");
        
    }
        System.out.println();
    }

    }
    

