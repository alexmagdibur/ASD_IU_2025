import java.util.Scanner;

public class TaskA1 {

    // конвертируем число
    public static String convertNumber(int N, int M) {
        if (M < 2 || M > 9) {
            throw new IllegalArgumentException("Неверное основание системы счисления");
        }
        if (N == 0) {
            return "0";
        }
        boolean isNegative = N < 0;
        int number = Math.abs(N);
        StringBuilder result = new StringBuilder();

        // заполняем строку
        while (number > 0) {
            int remainder = number % M;
            result.insert(0, remainder);
            number = number / M;
        }
        if (isNegative) {
            result.insert(0, '-');
        }

        return result.toString();
    }

    // проверяем
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    System.out.println(convertNumber(N, M));
    }
}