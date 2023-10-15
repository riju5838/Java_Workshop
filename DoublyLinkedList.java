public class DoublyLinkedList {
     ListNode head;
    ListNode tail;
     int length;

     class ListNode{
         int data;
        ListNode next;
         ListNode previous;

        public ListNode(int data){
            this.data=data;
        }
    }
    public  DoublyLinkedList(){
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
        ListNode newNode=new ListNode(value);
        if(isEmpty()){
            head=newNode;

        }
        else{
            tail.next=newNode;
        }

    
    newNode.previous=tail;
    tail=newNode;
    length++;
    }
    public void showFirst(){
        if(head==null){
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"   ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void showLast(){
        if(tail==null){
            
        }
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"   ");
            temp=temp.previous;
        }
        System.out.println("null");
    }

}
