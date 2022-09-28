import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Repeat this operation until we get the number 1 as a result.
        System.out.print(n);
        while(n != 1){
        if (n % 2 == 0) {
            // If n is an even number, divide it in half
            n = n/2;
        } else {
            // If it is odd, multiply it by 3 and add 1
            n = n*3;
            n ++;
        }
            System.out.print(" " + n);
        }
    }
}