//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    
    public static long solver(long t1, long t2,long N, long sum,int i){
        
        int MOD = 1000000007;
        
        if(i == N){
            return sum;
        }
        long t3 = (t1 + t2)% MOD;
        t1=t2;
        t2=t3;
        sum = (sum + t3)% MOD;
        return solver(t1,t2,N,sum,i+1);
    }
    static long fibSum(long N){
        return solver(0,1,N,1, 1);
        
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends