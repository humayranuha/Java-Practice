public class Constructor {
    String name;
    int year;

    // Constructor
    public Constructor(String name) {
        this(name, 2020); // Call other constructor
    }

    public Constructor(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public static void main(String[] args) {
        Constructor person = new Constructor("Alice");
        System.out.println(person.name + " was born in " + person.year);
    }
}
