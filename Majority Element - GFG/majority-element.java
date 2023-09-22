//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        if(size == 1) return a[0];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 1;
        int maxNum = -1;
        for(int i = 0; i<size; i++){
            if(hm.containsKey(a[i])){
                int b = hm.get(a[i])+1;
                hm.put(a[i], b);
                
                if(b>count){
                    maxNum = a[i];
                    count = b;
                }
                
            }else{
                
                hm.put(a[i], 1);
            }
        }
        if(count > size/2) return maxNum;
        return -1;
        
    }
}