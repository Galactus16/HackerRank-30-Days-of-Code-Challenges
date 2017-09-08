import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan  = new Scanner(System.in);
        int testCases = scan.nextInt();
        
        scan.nextLine();
        
        for(int j=0;j<testCases;j++){
            if(prime(scan.nextInt()))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
    
    static boolean prime(int num){
        if(num <= 1){
           return false; 
        }else{
           for (int i=2; i <= (int)Math.pow(num,0.5) ; i++){
                if(num%i == 0){
                    return false;
                }                
            }
            return true;
        }  
    }
}