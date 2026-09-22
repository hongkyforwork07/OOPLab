import java.util.Scanner;

public class Exercise225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = Double.parseDouble(input.next());
        double num2 = Double.parseDouble(input.next());
        System.out.printf("%.4f\n", num1 + num2);
        System.out.printf("%.4f\n", num1 - num2);
        System.out.printf("%.4f\n", num1 * num2);
        if (num2 == 0) System.out.println("Cannot divide");
        else System.out.printf("%.4f\n", num1 / num2);
        input.close();
    }
}