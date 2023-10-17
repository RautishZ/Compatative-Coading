//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) {
        if(n==1) return 0;
        
        long sum =0L;
        int leftMin=arr[0];
        int rightMin=arr[n-1];
        int max=0;
        int maxInd=0;
        
        for(int i = 0; i<n; i++){
            if(max<arr[i]){
                max=arr[i];
                maxInd = i;
            }
        }
        
        for(int i=1;i<=maxInd;i++){
            
            if(leftMin>arr[i]){
                sum+=(leftMin-arr[i]);
            }else if(leftMin<arr[i]){
                leftMin=arr[i];
            }
        }
        
        for(int i=n-2;i>maxInd;i--){
            if(rightMin>arr[i]){
                sum+=(rightMin-arr[i]);
            }else if(rightMin<arr[i]){
                rightMin=arr[i];
            }
        }
        return sum; 
    } 
    

}


