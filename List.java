package Assignment_7;

public class List {
    Node head;
    public void insert(int DATA){
        Node node=new Node();
        node.DATA=DATA;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;}

                n.next=node;
            
        }
        }
        public void insertAt(int index,int DATA){
            Node node=new Node ();
            node.DATA=DATA;
            node.next=null;
            
            Node  n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
       
        
    public void show(){
        Node node=head;
        while(node.next!=null){
            System.out.println(node.DATA);
            node=node.next;
        }
    } 
}
