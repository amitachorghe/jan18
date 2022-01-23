import java.util.*;

class median {

    public static double findMedian(int a[], int n) {
        Arrays.sort(a);

        if (n % 2 != 0)
            return (double) a[n / 2];

        return (double) (a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }

    public static void main(String args[]) {
        int a[] = { 1, 3, 4, 2, 7, 5, 8, 6, 4, 9 };
        int n = a.length;
        System.out.println("Median = " + findMedian(a, n));
    }
}
