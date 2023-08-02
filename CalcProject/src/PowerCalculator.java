public class PowerCalculator {
    public static double calculatePower(int num1, int num2){
        double result = 0;
        if (num1 == 0){
            throw new InvalidInputException("Некорректное основание!");
        } else if (num2<0){
            throw new InvalidInputException("Некорректная степень!");
        } else {
            double number1 = num1;
            double number2 = num2;
            result = Math.pow(number1, number2);
        }
        return result;
    }
}
