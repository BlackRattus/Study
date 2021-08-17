package Calc;
import java.util.Scanner;
import static Calc.Logic.*;


public class Main {

    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;
        int result;
        String result2;

        System.out.println("Калькулятор");
        String line = read.nextLine();
        String logic = Logic.getNum(line);

        if (Logic.RomanNums(numbers)) {
            num1 = Roman.RomanToArabic(numbers[0]);
            num2 = Roman.RomanToArabic(numbers[1]);
            result = Check.calculate(num1, num2, oper);
            result2 = Roman.ArabicToRoman(result);
            System.out.println(result2);
        } else {
            num1 = Integer.parseInt(numbers[0]);
            num2 = Integer.parseInt(numbers[1]);
            result = Check.calculate(num1, num2, oper);
            System.out.println(result);
        }
    }
}
