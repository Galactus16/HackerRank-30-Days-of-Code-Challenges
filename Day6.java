import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int LineGiven = scan.nextInt();
        String[] words = new String[LineGiven];
        scan.nextLine();
        for(int i=0;i<LineGiven; i++){
            words[i] = scan.nextLine();
        }
        scan.close();
        
        for(int j=0;j<LineGiven; j++){
           for(int k=0; k<words[j].length(); k=k+2){
               System.out.print(words[j].charAt(k));
           }
           System.out.print(" ");
           for(int k=1; k<words[j].length(); k=k+2){
               System.out.print(words[j].charAt(k));
           }
           System.out.println("");
        }
    }
}