 import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class DSTACK {
   


    
    Scanner sc=new Scanner(System.in);
    
   int Capacity=sc.nextInt();
    int STACK[]=new int[Capacity];
   int top=0;
    public void push(int data){
      if(size()==Capacity)
        expand();
    
        STACK[top]=data;
        top++;}

 public void expand() {
        int length=size();
        int newStack[]=new int[Capacity*2];
        System.arraycopy(STACK,0,newStack,0,length);
        STACK=newStack;
        Capacity*=2;
    }
    public int size(){
        return top;}
        public int pop(){
     
            int data=0;
            if(isEmpty()){
                System.out.println("stack is empty");
            }
            else{
            top--;
            data=STACK[top];
            STACK[top]=0;
           shrink();
        }return data;
        }
        public void shrink(){
            int length=size();
            if(length==(Capacity/2)/2)
            Capacity=Capacity/2;
            int newStack[]=new int[Capacity];
            System.arraycopy(STACK,0,newStack,0,length);
            STACK= newStack;
        }
        public boolean isEmpty()
        {
            return top<=0;}
    

    public void show(){
        for(int n:STACK){
        System.out.print(n+"   ");
        
    }
        System.out.println();
    }

    }
    


    

