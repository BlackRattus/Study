package Calc;


public class Roman {

    public static String ArabicToRoman(int num) {
        String[] chars = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String result = "";

        for (int i = 0; i < value.length; i++) {
            while (num >= value[i]) {
                num -= value[i];
                result += chars[i];
            }
        }
            return result;
    }

    public static int RomanToArabic(String num) {
        switch (num) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                return -1;
        }
    }
}