import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean output = cups >= 10 && cups <= 20 && weekend == false || cups >= 15 && cups <= 25 && weekend == true;
        System.out.println(output);
    }
}