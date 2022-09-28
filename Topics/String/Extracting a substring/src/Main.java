import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toExtract = scanner.next();
        int beginIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        String extracted = toExtract.substring(beginIndex,endIndex+1);
        System.out.println(extracted);
    }
}