interface FirstInterface {
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    @Override
    public void myMethod() {
        System.out.println("Some text ...");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Some other text ...");
    }
}

public class Interface {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}

