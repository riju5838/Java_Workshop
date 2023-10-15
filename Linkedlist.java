public class Linkedlist {
    NODE head;
    public void insert(int Data){
        NODE node=new NODE();
        node.Data=Data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else
        {
            NODE n=head;
            while(n.next!=null){
                n=n.next;}
                n.next=node;
            }

            }
            public void insertAtStart(int Data){
                NODE node=new NODE();
                node.Data=Data;
                node.next=null;
                node.next=head;
                head=node;
            }
        
            public void insertAt(int index,int Data){
                NODE node=new NODE();
                node.Data=Data;
                node.next=null;
           
                NODE n=head;
                for(int i=0;i<index-1;i++){
                    n=n.next;
                }
                node.next=n.next;
                n.next=node;
            }
            public void deleteAt(int index){
                if(index==0){
                    head=head.next;
                }
                else{
                    NODE n=head;
                   
                    NODE n1=null;
                    for(int i=0;i<index-1;i++){
                        n=n.next;}
                       n1=n.next;
                       n.next=n1.next;
                        System.out.println("n1"+n1.Data);
                    
                }
            }
        
           
            public void show(){
                NODE node=head;
                while(node.next!=null){
                    System.out.println(node.Data);
                
                node=node.next;
                
            }
            System.out.println(node.Data);
        }

            
            
    }
    
    
    

