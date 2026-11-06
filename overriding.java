
class A {
    // Method Overloading
    void display() {
        System.out.println("Hello");
    }

    void display(int a) {
        System.out.println("Number: " + a);
    }

    // Method to be overridden
    void show() {
        System.out.println("Parent class");
    }
}

class B extends A {
    // Method Overriding
    @Override
    void show() {
        System.out.println("Child class");
    }
}

public class overriding{
    public static void main(String[] args) {
        B obj = new B();

        // Overloading
        obj.display();
        obj.display(10);

        // Overriding
        obj.show();
    }
}
