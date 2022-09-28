import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int tablet = scanner.nextInt();

        int chocolate = height * width;
        int remainder = chocolate - tablet;
        Boolean result = false;
        int modulus1 = tablet % width;
        int modulus2 = tablet % height;
        boolean isTabletSmallerThanWidth = tablet % width == 0 ;
        boolean isTabletSmallerThanHeigth = tablet % height == 0 ;

        result = isTabletSmallerThanWidth || isTabletSmallerThanHeigth;

        if (result && chocolate > tablet) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}