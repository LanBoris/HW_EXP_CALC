import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Добро пожаловать в калькулятор!");
        try {
                while (true){
                    int number1 = inputInt("Введите первое число: ");
                    int number2 = inputInt("Введите второе число: ");
                    String cmd = inputString("Выбирите операцию (+, -, *, /, ^): ");
                    if (cmd.equals("+")) {
                        int result = Calculator.sumNumbers(number1, number2);
                        System.out.println("Результат операции: " + result);
                        break;
                    }
                    if (cmd.equals("-")) {
                        int result = Calculator.diffNumbers(number1, number2);
                        System.out.println("Результат операции: " + result);
                        break;
                    }
                    if (cmd.equals("*")) {
                        int result = Calculator.multiNumbers(number1, number2);
                        System.out.println("Результат операции: " + result);
                        break;
                    }
                    if (cmd.equals("/")) {
                        double result = Calculator.divNumbers(number1, number2);
                        System.out.println("Результат операции: " + result);
                        break;
                    }
                    if (cmd.equals("^")){
                        double result = PowerCalculator.calculatePower(number1, number2);
                        System.out.println("Результат операции: " + result);
                        break;
                    }
                }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Вы ввели не число!");
        }
    }

    public static String inputString(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextLine().toUpperCase();
    }

    public static int inputInt(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(input.nextLine());
    }
}
