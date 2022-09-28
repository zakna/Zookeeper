import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        long a = 100000000001L;
        long[] longNumbers;
        longNumbers = new long[] {a,a+1,a+2};
        System.out.println(Arrays.toString(longNumbers));
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 6;
        n = arr[arr[n]];
        System.out.println(n);
    }
}