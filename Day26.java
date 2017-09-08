import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int[] expected = new int[3];
        int[] returned = new int[3];
        int fine = 0;
        
        for(int i = 0; i< 3; i++){
            returned[i] = scan.nextInt();
        }
        
        scan.nextLine();
        
        for(int i = 0; i< 3; i++){
            expected[i] = scan.nextInt();
        }
        
        if(returned[2] < expected[2] || (returned[2] <= expected[2] && returned[1] < expected[1]) || (returned[2] <= expected[2] && returned[1] <= expected[1] && returned[0] < expected[0] )){
            fine = 0;
        }else{
            if(returned[2] - expected[2] > 0){
                fine = 10000;
            }else{
                if(returned[1] - expected[1] > 0 && returned[2] - expected[2] == 0){
                    fine = 500 * (returned[1] - expected[1]);
                }else if(returned[0] - expected[0] > 0 && returned[1] - expected[1] == 0 && returned[2] - expected[2] == 0){
                    fine = 15 * (returned[0] - expected[0]);
                 }
                }
       }
               
        System.out.println(fine);
    }
}