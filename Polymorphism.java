class Animal {
    public void animalSound() {
        System.out.println("Animal makes sound!!!");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Bow Bow!!!");
    }
}

class Cat extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Meow, meow!!!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.animalSound();
        dog.animalSound();
        cat.animalSound();
    }
}