import java.util.Scanner;

class Calci {
    public Float add(Float x, Float y) {
        return x + y;
    }

    public Float multi(Float x, Float y) {
        return x * y;
    }

    public Float sub(Float x, Float y) {
        return x - y;
    }

    public Float div(Float x, Float y) {
        
            return x / y;
    
        }
    }

 
class Main {
    public static void main(String[] args) {
       
        Float x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        x = sc.nextFloat();
        System.out.println("Enter second number");
        y = sc.nextFloat();

        Calci calculator = new Calci();

        System.out.println("Addition of two numbers is: " + calculator.add(x, y));
        System.out.println("Multiplication of two numbers is: " + calculator.multi(x, y));
        System.out.println("Subtraction of two numbers is: " + calculator.sub(x, y));
        System.out.println("Division of two numbers is: " + calculator.div(x, y));

        sc.close();
    }
}
