public class QUEUE {
    int Queue[]=new int[5];
    int size;
    int front;
    int rear;
    public void enQUEUE(int data){
      if(!isFull()){

        Queue[rear]=data;
        rear=(rear+1)%5;
        size=size+1;}
        else{
            System.out.println("is full");
        }
    }
    public int deQUEUE(){
       

        
        int data=Queue[front];
        if(!isEmpty()){
        front=(front+1)%5;
        size=size-1;}
            else{
                System.out.println("is empty");
            }
        return data;
    }
    public void show(){
        System.out.print("element :");
        for(int i=0;i<size;i++){
            System.out.print(Queue[(front+i)%5]+"   ");
        }
        System.out.println();
    
    for(int n:Queue){
        System.out.print(n+"  ");
    }
 

    }

public int getsize(){
return size;
}
public boolean isFull(){
    return size==5;
}
public boolean isEmpty(){
    return size==0;
}
}