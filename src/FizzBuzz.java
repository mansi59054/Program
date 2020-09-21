
public class FizzBuzz {
    public static int lastdigit(int n) {                //Function that finds the last digit of the number
        return n % 10;
    }

    public static String function1(int n) {                // Function to check if the number is divisible by 3, 5 or both
        boolean divby3 = (n % 3 == 0);
        boolean divby5 = (n % 5 == 0);
        if (divby3 && divby5) {
            return "FizzBuzz";
        } else if (divby3 || lastdigit(n) == 3) {        //Add one more condition in if
            return "Fizz";
        } else if (divby5 || lastdigit(n) == 5) {
            return "Buzz";
        } else {
            return Integer.toString(n);
        }
    }
}
