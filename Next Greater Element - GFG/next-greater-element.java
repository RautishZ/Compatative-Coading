//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long temp = 0;
        Stack<Long> s = new Stack<>();
        for(int i = n-1; i>=0;i--){
            if(s.isEmpty()){
                s.push(arr[i]);
                arr[i] = -1;
            }else if(s.peek()==arr[i]){
                s.pop();
                i++;
            }else if(s.peek()>arr[i]){
                temp = arr[i];
                arr[i]=s.peek();
                 s.push(temp);
            }else if(s.peek()<arr[i]){
                while(s.peek()<arr[i]){
                    s.pop();
                    if(s.isEmpty()){
                        break;
                    }
                }
                i++;
            }
            
        }
        return arr;
    } 
}