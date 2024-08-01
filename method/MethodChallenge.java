import java.util.*;

public class MethodChallenge {
    // find the number is prime
    static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

    // Find GCD of 2 number
    static int GCD(int m, int n) {
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }

        }
        return m;

    }

    // Find Max element in an array
    static int max(int a[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
         if(largest <a[i])
         {
         largest =a[i];
        }
     }
     return largest;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // FindPrime
        int n = 91;
        System.out.println(isPrime(n));

        // GCD
        System.out.println(GCD(35, 56));
        int num[]={10,45,23,54,23,67,89,100};
        System.out.println(max(num));

    }
}

