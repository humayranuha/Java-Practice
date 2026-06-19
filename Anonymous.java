interface Drinks {
    public void thirsty();
}

class Food {
    public void foody() {
        System.out.println("Ice-cream!!!");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        Food myFood = new Food() {
            @Override
            public void foody() {
                System.out.println("I love Mocha!!!");
            }
        };

        Drinks myDrink = new Drinks() {
            @Override
            public void thirsty() {
                System.out.println("Vanilla flavoured milk!!!");
            }
        };

        myFood.foody();
        myDrink.thirsty();
    }
}
