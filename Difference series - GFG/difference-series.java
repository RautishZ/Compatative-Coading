//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            int ans = ob.differenceSeries(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
//User function Template for Java
class Solution{
    
    public static int solver(int diff, int i,int sum,int N){
        
        if(i==N){
            return sum;
        }
        diff = diff + 4;
        sum = sum +diff;
        return solver(diff,i+1,sum,N);
        
    }
    
    static int differenceSeries(int N){
        
        return solver(-1,0,0,N);
    }
}