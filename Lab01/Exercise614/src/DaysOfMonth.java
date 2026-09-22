import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = -1;
        int monthNum = -1;

        while (true) {
            System.out.print("Nhập tháng (tên đầy đủ, viết tắt, 3 chữ cái hoặc số): ");
            String monthInput = scanner.nextLine().trim();

            System.out.print("Nhập năm (số nguyên không âm, ví dụ: 1999): ");
            String yearInput = scanner.nextLine().trim();

            try {
                year = Integer.parseInt(yearInput);
                if (year < 0) {
                    System.out.println("Năm không hợp lệ. Vui lòng nhập lại.");
                    continue;
                }
            }

            catch (NumberFormatException e) {
                System.out.println("Năm không hợp lệ. Vui lòng nhập lại.");
                continue;
            }

            monthNum = getMonthNumber(monthInput);
            if (monthNum == -1) {
                System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            break;
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int days = getDays(monthNum, isLeapYear);

        System.out.println("Số ngày trong tháng " + monthNum + " năm " + year + " là: " + days);
        scanner.close();
    }


    private static int getMonthNumber(String month) {
        switch (month.toLowerCase()) {
            case "1": case "jan": case "jan.": case "january": return 1;
            case "2": case "feb": case "feb.": case "february": return 2;
            case "3": case "mar": case "mar.": case "march": return 3;
            case "4": case "apr": case "apr.": case "april": return 4;
            case "5": case "may": return 5;
            case "6": case "jun": case "june": return 6;
            case "7": case "jul": case "july": return 7;
            case "8": case "aug": case "aug.": case "august": return 8;
            case "9": case "sep": case "sept.": case "september": return 9;
            case "10": case "oct": case "oct.": case "october": return 10;
            case "11": case "nov": case "nov.": case "november": return 11;
            case "12": case "dec": case "dec.": case "december": return 12;
            default: return -1;
        }
    }

    private static int getDays(int monthNum, boolean isLeapYear) {
        if (monthNum == 2) {
            return isLeapYear ? 29 : 28;
        }
        else if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) {
            return 30;
        }
        else {
            return 31;
        }
    }
}