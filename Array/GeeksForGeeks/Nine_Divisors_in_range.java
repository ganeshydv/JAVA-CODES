package GeeksForGeeks;

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution1 {
    static long nineDivisors(long N){
        // odd divisors means perfect square
        // nos less than sqrt(N) will have perfect squares less than N
        // sqrt(N)*sqrt(N) time it takes to check for #divisors less than sqrt(N)
        // for very long N it won't pass
        // after going threw comments
        // for 9 divisors numbers, there is a property
        // the number can be divided into p**2^p2**2 or p3**8 where p1,p2 and p3 are primes

        // get primes till O(sqrt(N)) using seive which takes Mloglog(M) ; M-> O(sqrt(N))
        // using binary search on primes array for every two using binary search which takes Mlog(M)
        // better approach let's proceed
        ArrayList<Long> prime = new ArrayList<>();
        long M = (long)Math.sqrt(N);
        int[] isPrime = new int[(int)(Math.sqrt(N)+1)];
        Arrays.fill(isPrime,1);
        isPrime[0] = isPrime[1] = 0;

        for(int i=2; i*i<=M; ++i){
            if(isPrime[i] == 1){
                for(int j=i*i; j<=M; j+=i){
                    isPrime[j] = 0;
                }
            }

        }
        for(int i=0; i<=M; ++i){
            if(isPrime[i]==1){
                prime.add((long)i);
            }
        }
        // got primes till M
        // use binary search
        long cnt = 0;
        int sz = prime.size();
        // Number present by p1^2 * p2^2
        for(int i=sz-1; i>=0; --i){
            long p1 = prime.get(i);
            long cannotExceedValue = (long)(Math.sqrt(N)/p1);
            int low = 0;
            int high = i-1;
            long res = 0; // worst case 0(no number) will be added
            while(low<=high){
                int mid = low+(high-low)/2;
                long p2 = prime.get(mid);
                if(p2 <= cannotExceedValue){
                    res = mid+1; // # cnt of primes which are ok for us
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            // System.out.println(p1+" "+"cnt "+(res-i));
            cnt += (res*1L);
        }
        // Number present by p^8
        for (int i = 0; i < sz; i++) {
            long square = prime.get(i) * prime.get(i);
            if (square * square * square * square <= N)
                cnt += 1;
            else
                break;
        }
        return cnt;

    }
}

//{ Driver Code Starts.
class Nine_Divisors_in_range
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());

            Solution1 ob = new Solution1();
            System.out.println(ob.nineDivisors(N));
        }
    }
}
// } Driver Code Ends
