//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            long ans[] = obj.Series(n);
            for (long i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    
    public static void solver(long[] l,long t1, long t2,int N,int i){
        if(i>N){
            return;
        }
        long t3 = t1+t2;
        t1 = t2;
        t2 = t3;
        solver(l,t1,t2,N,i+1);
         l[i] = t3;
        
    }

    long[] Series(int N) {
        long[] l = new long[N+1];
        l[0] = 0;
        l[1] = 1;
        solver(l,l[0],l[1],N,2);
        return l; 
    }
}