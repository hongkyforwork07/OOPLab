import java.util.Scanner;

public class Exercise226 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- CHƯƠNG TRÌNH GIẢI PHƯƠNG TRÌNH ---");
            System.out.println("1. Giải phương trình bậc nhất một ẩn (ax + b = 0)");
            System.out.println("2. Giải hệ phương trình bậc nhất hai ẩn");
            System.out.println("3. Giải phương trình bậc hai một ẩn (ax^2 + bx + c = 0)");
            System.out.println("0. Thoát");
            System.out.print("Vui lòng chọn (0-3): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation(scanner);
                    break;
                case 2:
                    solveLinearSystem(scanner);
                    break;
                case 3:
                    solveQuadraticEquation(scanner);
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void solveLinearEquation(Scanner scanner) {
        System.out.println("--- Phương trình bậc nhất (ax + b = 0) ---");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            }
            else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
        else {
            double x = -1 * b / a;
            System.out.println("Phương trình có một nghiệm duy nhất: x = " + x);
        }
    }


    private static void solveLinearSystem(Scanner scanner) {
        System.out.println("--- Hệ phương trình bậc nhất hai ẩn ---");
        System.out.println("Dạng: a11*x1 + a12*x2 = b1");
        System.out.println("      a21*x1 + a22*x2 = b2");

        System.out.print("Nhập a11: "); double a11 = scanner.nextDouble();
        System.out.print("Nhập a12: "); double a12 = scanner.nextDouble();
        System.out.print("Nhập b1:  "); double b1 = scanner.nextDouble();

        System.out.print("Nhập a21: "); double a21 = scanner.nextDouble();
        System.out.print("Nhập a22: "); double a22 = scanner.nextDouble();
        System.out.print("Nhập b2:  "); double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Hệ phương trình có nghiệm duy nhất:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        }
    }

    private static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("\n--- Phương trình bậc hai (ax^2 + bx + c = 0) ---");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Vì a = 0, phương trình trở thành phương trình bậc nhất (bx + c = 0).");
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có một nghiệm: x = " + x);
            }
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm (không có nghiệm thực).");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}