public class TypeCasting {
    public static void main(String[] args) {
        // widening (automatic) type casting
        int myInt = 100;    
        double myDouble = myInt; // automatic casting: int to double
        System.out.println("Integer value: " + myInt); // Outputs 100
        System.out.println("Double value: " + myDouble); // Outputs 100.0

        // narrowing (manual) type casting
        double myDouble2 = 9.78;                
        int myInt2 = (int) myDouble2; // manual casting: double to int
        System.out.println("Double value: " + myDouble2); // Outputs 9. 
        System.out.println("Integer value: " + myInt2); // Outputs 9
    }
}
