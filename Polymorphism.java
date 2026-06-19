class AnimalP {
    public void animalSound() {
        System.out.println("Animal makes sound!!!");
    }
}

class DogP extends AnimalP {
    @Override
    public void animalSound() {
        System.out.println("Bow Bow!!!");
    }
}

class CatP extends AnimalP {
    @Override
    public void animalSound() {
        System.out.println("Meow, meow!!!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        AnimalP animal = new AnimalP();
        DogP dog = new DogP();
        CatP cat = new CatP();

        animal.animalSound();
        dog.animalSound();
        cat.animalSound();
    }
}