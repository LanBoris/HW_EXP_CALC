public class Calculator {
    private static int result;

    public static int sumNumbers(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    public static int multiNumbers(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    public static int diffNumbers(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    public static double divNumbers(double num1, double num2) {
        if (num2 == 0) {
            throw new InvalidInputException("Деление на 0 недопустимо!");
        }
        double resultDouble = num1 / num2;
        return resultDouble;
    }
}
