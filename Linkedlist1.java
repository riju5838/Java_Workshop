public class Linkedlist1 {
    Node1 head;
    public void insert(int Data){
        Node1 node=new Node1();
        node.Data=Data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node1 n=head;
            while(n.next!=null){
                n=n.next;}
                n.next=node;
        }
        }

        public void show(){
            Node1 node=head;
            while(node.next!=null){
                System.out.println(node.Data);
                node.next=node;
            }
        
            System.out.println(node.Data);
        

    }
}
