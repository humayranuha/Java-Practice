// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Sleeping...z z z !!!");
    }
}

// Subclass (inherit from Animal)
class Cat extends Animal {
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("Meow, meow!!!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.sleep();
    }
}