	public static int getHeight(Node root){
      //Write your code here
      int height = -1;
      if(root == null){
          return -1;
      }else{
          height = 1 + max(getHeight(root.left),getHeight(root.right));
      }
       
      return height;
    }

    public static int max(int a, int b){
        return a > b ? a:b;
    }
