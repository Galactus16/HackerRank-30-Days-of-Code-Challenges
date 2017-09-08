import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        System.out.println(factorial(number));
    }
    
    static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}