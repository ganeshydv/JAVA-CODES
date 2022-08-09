package GeeksForGeeks;
//Input:
//N = 5, K = 3
//arr[] = {1,2,3,4,5}
//Output: 3 2 1 5 4
//Explanation: First group consists of elements
//1, 2, 3. Second group consists of 4,5.

///---------------

//Your Task:
//You don't need to read input or print anything.
// The task is to complete the function reverseInGroups() which takes the array,
// N and K as input parameters and modifies the array in-place.

//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)


import java.io.*;
import java.util.*;

public class Reverse_array_in_groups   {//GFG
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases

        //while testcases exist
        while(t-->0){

            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);

            ArrayList<Integer> arr = new ArrayList<>();
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr.add(Integer.parseInt(inputLine2[i]));
            }

            Solution1 obj = new Solution1();
            obj.reverseInGroups(arr, n, k);

            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr.get(i) + " ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        if(k <= 1) return;

        if(k >= arr.size())
            k = arr.size();

        int count = 0;
        while(count + k  <= arr.size()) {
            reverse(arr, count, count + k - 1);
            count += (k);
        }
        if(count + k != arr.size()) {
            reverse(arr, count, arr.size()-1);
        }
    }
    void reverse(ArrayList<Integer> arr, int start, int end) {
        while(start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++; end--;
        }
    }


}

