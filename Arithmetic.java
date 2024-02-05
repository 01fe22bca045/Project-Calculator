public class Arithmetic {
    // Method to calculate the square of a number
    public static double square(double number) {
        return Math.pow(number, 2);
    }

    // Method to calculate the cube of a number
    public static double cube(double number) {
        return Math.pow(number, 3);
    }

    // Method to calculate the modulus of two numbers
    public static double modulus(double dividend, double divisor) {
        return dividend % divisor;
    }

    // Method to calculate the power of a number raised to an exponent
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Main method to demonstrate the extended arithmetic operations
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 3;

        System.out.println("Square of " + num1 + ": " + square(num1));
        System.out.println("Cube of " + num1 + ": " + cube(num1));
        System.out.println("Modulus of " + num1 + " and " + num2 + ": " + modulus(num1, num2));
        System.out.println("Power of " + num1 + " raised to " + num2 + ": " + power(num1, num2));
    }
}
