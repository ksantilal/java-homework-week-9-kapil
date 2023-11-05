package programme1_calculate;


import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {
        // Declaration of scanner
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        String answer;
        boolean t;

        System.out.println("Enter first number :");
        int a = scanner.nextInt();
        System.out.println("Enter second number :");
        int b = scanner.nextInt();
        System.out.println("Enter one of symbol : +,-,/,*");
        char symbol = scanner.next().charAt(0);
        main.getCalculationResult(a, b, symbol);
        System.out.println("\ndo you want to continue  (y/n)          : ");

        while (true) {
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("n")) {
                t = true;
                break;
            } else if (answer.equals("y")) {

                System.out.print("Please enter first number               : ");
                int x = scanner.nextInt();
                System.out.print("Please enter second number              : ");
                int y = scanner.nextInt();
                System.out.print("Please enter on of symbol +,-,/,*       : ");
                char z = scanner.next().charAt(0);
                main.getCalculationResult(x, y, z);
                System.out.print("\nWould you like to do more calculation Please enter (y/n)         :");
            }
        }
    }
}