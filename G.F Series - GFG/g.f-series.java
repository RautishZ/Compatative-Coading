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
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    
    public static void solver(long t1,long t2,long t3,int N){
      
        if(N <= 2){
            return;
        }else{
            t3 = t1*t1 - t2;
            t1 = t2;
            t2 = t3;
            System.out.print(t3+" ");
            solver(t1,t2,t3,N-1);
        }
        
        
        
        
    }
   
    static void gfSeries(int N){
        long t1 = 0;
        long t2 = 1;
        long t3 = 0;
        System.out.print(t1+" "+t2+" ");
        solver(t1,t2,t3,N);
        System.out.println();
       
    }
}