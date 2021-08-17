package Calc;


public class Check {

    public static int calculate(int a, int b, String operator) {
        int res;
        if (a < 1 || a > 10 || b < 1 || b > 10) throw new IllegalArgumentException("Числа от 1 до 10, не более.");
        switch (operator) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            default:
                throw new IllegalArgumentException("Формат математической операции не удовлетворяет заданию.");
        }
        return (res);
    }
}

