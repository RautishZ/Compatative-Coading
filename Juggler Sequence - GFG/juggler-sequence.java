//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            StringBuilder out = new StringBuilder();
            ans = ob.jugglerSequence(N);
            for(int i = 0;i < ans.size();i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public static void solver( List<Integer> l, int N){
        if(N==1){
            return;
        }
        if(N%2==0){
            
            N= (int)Math.pow(N,0.5);
            l.add(N);
            
        }else{
            N= (int)Math.pow(N,1.5);
            l.add(N);
        }
        solver(l,N);
        
    }
    
    static List<Integer> jugglerSequence(int N){
        List<Integer> l = new LinkedList<>();
        l.add(N);
        solver(l,N);
        return l;
    }
}