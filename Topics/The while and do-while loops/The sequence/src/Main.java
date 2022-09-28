import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int elements = scanner.nextInt();
        int count = 0;
        int evaluate = 0;
        int divisibleBy4 = 0;
        int dividend = 4;
        while (scanner.hasNext() && count < 1000  && elements > 0) {
            count++;
            elements--;
            evaluate = scanner.nextInt();
            if(evaluate % dividend == 0 && evaluate > divisibleBy4) {
                divisibleBy4 = evaluate;
            }
        }
        System.out.println(divisibleBy4);
    }
}