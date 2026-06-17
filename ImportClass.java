
import java.util.Scanner;


public class ImportClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = myObj.nextLine();

        System.out.println("Enter your age: ");
        int age = myObj.nextInt();

        System.out.println(name + " is " + age + " years old");

        myObj.close();
    }
}
