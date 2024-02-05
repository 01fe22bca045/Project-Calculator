public class Mathematical {
    public static void main(String[] args) {
        // Functionality 1: Absolute value
        double num1 = -5.5;
        double absValue = Math.abs(num1);
        System.out.println("Absolute value of " + num1 + " is: " + absValue);

        // Functionality 2: Square root
        double num2 = 16;
        double sqrtValue = Math.sqrt(num2);
        System.out.println("Square root of " + num2 + " is: " + sqrtValue);

        // Functionality 3: Power
        double base = 2;
        double exponent = 3;
        double powerValue = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + powerValue);

        // Functionality 4: Trigonometric sine
        double angle = Math.PI / 6; // 30 degrees in radians
        double sinValue = Math.sin(angle);
        System.out.println("Sine of " + angle + " radians is: " + sinValue);

        // Functionality 5: Trigonometric cosine
        double cosValue = Math.cos(angle);
        System.out.println("Cosine of " + angle + " radians is: " + cosValue);

        // Functionality 6: Trigonometric tangent
        double tanValue = Math.tan(angle);
        System.out.println("Tangent of " + angle + " radians is: " + tanValue);
    }
}
