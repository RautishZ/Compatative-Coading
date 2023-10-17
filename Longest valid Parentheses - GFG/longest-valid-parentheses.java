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
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
       
        Stack ch = new Stack();
        Stack<Integer> index = new Stack<>();
        index.push(-1);
        int max = 0;
        int currentMax = 0;
        for(int i=0;i<S.length(); i++){
            if(S.charAt(i) == '('){
                ch.push('(');
                index.push(i);
            }else if(!ch.isEmpty() && S.charAt(i) == ')'){
                ch.pop();
                index.pop();
                currentMax = i-index.peek();
                if(max<currentMax) max=currentMax;
            }else if(ch.isEmpty() && S.charAt(i) == ')'){
                index.push(i);
            }
        }
        
        return max;
    }
}