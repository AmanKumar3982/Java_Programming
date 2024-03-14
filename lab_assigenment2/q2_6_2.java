import java.util.Scanner;

public class q2_6_2 {
    public static String get_ones(int ones) {
        switch (ones) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return ""; 
        }
    }

    public static String get_teens(int teens) {
        switch (teens) {
            case 1: return "eleven";
            case 2: return "twelve";
            case 3: return "thirteen";
            case 4: return "fourteen"; 
            case 5: return "fifteen";
            case 6: return "sixteen";
            case 7: return "seventeen";
            case 8: return "eighteen";
            case 9: return "nineteen"; 
            default: return ""; 
        }
    }

    public static String get_tens(int tens) {
        switch (tens) {
            case 1: return "ten";
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety"; 
            default: return ""; 
        }
    }

    public static String convert_into_word(int number) {
        if (number < 0 || number > 99999) { 
            return "out of range"; 
        }else if(number==10){
            return get_tens(number/10);
        }

        if (number <= 10) {
            return get_ones(number);
        } else if (number < 20) {
            return get_teens(number - 10);
        } else if (number < 100) {
            return get_tens(number / 10) + " " + get_ones(number % 10);
        } else if (number < 1000) {
            return get_ones(number / 100) + " hundred " + convert_into_word(number % 100);
        } else {
            return convert_into_word(number / 1000) + " thousand " + convert_into_word(number % 1000);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("zero");
        } else {
            System.out.println("in words: " + convert_into_word(number));
        }
    }
}
