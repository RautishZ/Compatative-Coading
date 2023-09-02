//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthOfSeries(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    
    public static long solver(long sum,int i,long n){
        if(i==n){
            return sum;
        }
        sum = sum+(8+16*i); 
        return solver(sum,i+1,n);
        
    }
    static long nthOfSeries(long n){
        return solver(9,1,n);
    }
}