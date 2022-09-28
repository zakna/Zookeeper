import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int reverse = 0;
        int lastDigit = 0;
        int input = scanner.nextInt();
        int number = input;
        while(number  > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number /10;
        }
        if(input==reverse)
        System.out.println(1);
        else System.out.println(2);

    }
}