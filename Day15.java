    public static  Node insert(Node head,int data) {
        //Complete this method
        Node n = new Node(data);
        if(head == null){            
            head = n;
            head.next = null;
        }else{
            Node p = head;
            while(p.next != null){
                p = p.next;
            }
            p.next = n;
            n.next = null;
        }
        
        return head;
    }
