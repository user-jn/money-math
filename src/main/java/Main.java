import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // EXERCISE 3 - BigDecimal //

        // Create float, double, and BigDecimal
        // Initialize all three variables to zero - BigDecimal uses BigDecimal.ZERO

        float floatValue = 0.0f;
        double doubleValue = 0.0;
        BigDecimal bigDecimalValue = BigDecimal.ZERO;

        // Create a loop that runs 10 times
        // Add 0.10 to each variable
        // Print all three values each iteration

        System.out.println("=== LOOP 10 TIMES , ADDING .10 ===");

        for (int i = 1; i <= 10; i++) {
            floatValue += 0.10f;
            doubleValue += 0.10;
            bigDecimalValue = bigDecimalValue.add(new BigDecimal(".10"));

            System.out.println("Iteration " + i);
            System.out.println("Float: " + floatValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("BigDecimal: " + bigDecimalValue);
            System.out.println(); // adds a blank line between iterations until loop stops

        }

        // RESET VALUES //

        // Reset all three variables back to zero

        floatValue = 0.0f;
        doubleValue = 0.0;
        bigDecimalValue = BigDecimal.ZERO;


        // Second Loop - 1000 iterations

        // create a loop that runs 1000 times
        // add 19.99 to each variable
        // print results AFTER the loop

        System.out.println("\n=== LOOP 1000 TIMES, ADDING 19.99 ===");

        for (int i = 1; i <= 1000; i++) {
            floatValue += 19.99f;
            doubleValue += 19.99;
            bigDecimalValue = bigDecimalValue.add(new BigDecimal("19.99"));
        }

        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("BigDecimal: " + bigDecimalValue);



    }
    }


