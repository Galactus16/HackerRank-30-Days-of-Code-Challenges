static void levelOrder(Node root){
      //Write your code here
      LinkedList<Node> queue = new LinkedList<Node>();
    
      if(root == null){
          System.out.print("");
      }else{
          queue.add(root);
     
          while(!queue.isEmpty()){
              Node n = queue.remove();
              System.out.print(n.data+" ");
              
              if(n.left != null){
                queue.add(n.left);
              }
          
              if(n.right != null){
                queue.add(n.right);
              }
          }
     
      }
    }