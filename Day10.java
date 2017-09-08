import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        Stack<Integer> bottle = new Stack<Integer>();
        
        while(input>0){
            bottle.push(input%2);
            input = input / 2;
        }
        
        int count = 0;
        int maxOne = 0;
        while(!bottle.empty()){
            //System.out.print(bottle.peek());
            if(bottle.pop() == 1){
                count++;
                if(maxOne < count)
                    maxOne = count;
            }else{                
                count = 0;
            }
        }
        
        System.out.println(maxOne);
    }
}