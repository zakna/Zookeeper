import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();

        System.out.println(b + " " + a);
        boolean b1 = true;
        boolean b2 = false;

        boolean f = !b1 && b2;
        boolean g = b1 && b2;
        boolean h = b1 || b2;
        boolean i = b1 ^ b2;
    }
}