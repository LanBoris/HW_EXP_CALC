public class PowerCalculator {
    public static double calculatePower(int num1, int num2){
        double result = 0;
        if (num1 == 0){
            throw new InvalidInputException("Некорректное основание!");
        } else if (num2<0){
            throw new InvalidInputException("Некорректная степень!");
        } else {
            result = Math.pow((double) num1, (double) num2);
        }
        return result;
    }
}
