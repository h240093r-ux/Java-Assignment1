package number_filter;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
   
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Step 2: Throw custom exception
            throw new InvalidAgeException("Age must be 18 or above to register!");
        } else {
            System.out.println("Welcome! You are eligible to register.");
        }
    }

    public static void main(String[] args) {
        try {
           
            int age = 16; 
            checkAge(age);
        } catch (InvalidAgeException e) {
            // Step 4: Catch and display message
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
