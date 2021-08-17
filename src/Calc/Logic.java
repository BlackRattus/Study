package Calc;

public class Logic {

    public static String[] numbers;
    public static String oper;

    public static String getNum(String input) throws Exception {
        input = input.replaceAll("\\s+", "");
        try {
            numbers = input.split("[\\+\\-\\*\\/]");
            oper = input.substring(numbers[0].length(), numbers[0].length() + 1);
        } catch (Exception e) {
            throw new Exception("Неверная операнда.");
        }
        if (numbers.length != 2) {
            throw new Exception("Неверный формат ввода");
        }
        return input;
    }

    public static boolean RomanNums(String[] input) throws Exception {
        if (numbers[0].matches("[1-9][0]{0,1}") && numbers[1].matches("[1-9][0]{0,1}")) {
            return false;
        } else if (numbers[0].matches("[IVX][IVX]{0,1}[I]{0,2}") &&
                numbers[1].matches("[IVX][IVX]{0,1}[I]{0,2}")) {
            return true;
        } else {
            throw new Exception("Используются одновременно разные системы счисления."); //срабатывает когда вводишь числа больше 10
        }
    }
}
