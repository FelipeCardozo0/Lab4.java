
public class Lab4 {
    public static void main(String[] args){}

    public static String compareNumbers(int x, int y) {
        if (x < y) {
            return x + " is smaller than " + y;
        } else if (x > y) {
            return x + " is greater than " + y;
        } else {
            return x + " is equal to " + y;
        }
    }
        // Missing } after the method body to close the method, syntax error
        // Logical error: X>=y is always true so the following else is never executed, replaced with x>y

    public static String meetings(int students, int minimum, int minutes) {
        String answer = "";
        if (students < 0 || minutes < 0) {
            answer = "There's no such thing as negative students or negative minutes!";
        } else if (students * minimum > minutes) {
            answer = "There is not enough time for all student meetings. ";
            answer += "Professor must find at least " + (students * minimum - minutes) + " more minutes!";
        } else {
            answer = "Each student will have a " + (minutes / students) + " minute meeting with the professor, " + "and the professor will have " + (minutes % students) + " minutes of extra time.";
        }
        return answer;
    }
// Logical error: replaced && by ||, so if at least one of them are true it returns true,
// Logical error: % replaced by /, we want to find how many minutes each student will have, extra minutes of extra time is the next calculation,


    public static boolean primeChecker(int number){
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

// Syntax error: i equals 0 (==0), it's not getting assigned 0 (=0)
// Logical error: The method should return true only to prime numbers, so true replaced by false (when a divisor is found),

        public static double temperatureConverter(double celsius){
            double fahrenheit = (celsius * 9 / 5.0) + 32;
            return fahrenheit;
        }
        // Syntax error: method must be a double to compile, instead of an int
        // Logical error: For accurate calculation, at least one of the numbers should be a double because integer division results in an integer


    public static String multiplicationTable(int a){
        String result = "";
        for (int i = 1; i <= 10; i++) {
            int ans = a * i;
            result += ans + " ";
        }
        return result;
    }

    // Syntax error: missing ; after " " in the end of the statement
    // Syntax error: , replaced by ; after the initialization of the loop
}
