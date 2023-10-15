public class DOUBLYLIST {
    LISTNODE head;
    LISTNODE tail;
    int length;
    class   LISTNODE{
        int data;
        LISTNODE next;
        LISTNODE previous;

        public   LISTNODE(int data){
            this.data=data;

        }

    }
    public DOUBLYLIST(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int length(){
        return length;
    }
    public void insert(int value){
        LISTNODE newnode=new LISTNODE(value);
       
        if(isEmpty()){
            head=newnode;
        }
        else{
            tail.next=newnode;
        }
        newnode.previous=tail;
        tail=newnode;
        length++;
    }
  /*  public void showFirst(){
        if(head==null){
            return;
        }
        LISTNODE temp=head;
        while(temp!=null){
            temp=temp.next;
            System.out.println(temp.data+"  ");
        }
        System.out.println("null");
    }*/

}
