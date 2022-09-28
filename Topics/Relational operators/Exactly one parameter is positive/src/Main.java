import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isaOnlyPositive = a > 0 && b < 1 && c < 1;
        boolean isbOnlyPositive = b > 0 && a < 1 && c < 1;
        boolean iscOnlyPositive = c > 0 && b < 1 && a < 1;
        boolean isPositive = isaOnlyPositive || isbOnlyPositive || iscOnlyPositive;
        System.out.println(isPositive);
    }
}