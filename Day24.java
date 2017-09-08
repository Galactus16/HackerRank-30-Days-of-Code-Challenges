    public static Node removeDuplicates(Node head) {
      //Write your code here
        Node start = head;
        while (start.next != null){
            if (start.data == start.next.data) {
                start.next = start.next.next;
            } else {
                start = start.next;
           }
        }
        return head;
    }