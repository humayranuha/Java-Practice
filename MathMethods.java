public class MathMethods {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Math methods
        System.out.println("Max: " + Math.max(a, b));
        System.out.println("Min: " + Math.min(a, b));
        System.out.println("Absolute value of -5: " + Math.abs(-5));
        System.out.println("Square root of 16: " + Math.sqrt(16));
        System.out.println("Power of 2^3: " + Math.pow(2, 3));
        System.out.println("Random number between 0 and 1: " + Math.random());

        double c = 3.14;
        System.out.println("Round of 3.14: " + Math.round(c));
        System.out.println("Ceiling of 3.14: " + Math.ceil(c));
        System.out.println("Floor of 3.14: " + Math.floor(c));
    }
}
