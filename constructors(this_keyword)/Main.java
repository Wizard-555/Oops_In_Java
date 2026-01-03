package constructors;

class A {
    int a, b;
    
    A() {
        System.out.println("Default");
    }

    A(int x, int y) {
        this(x); // it calls the next constructor (A(int x))
        System.out.println("param");
        b = y;
    }

    A(int x) {
        System.out.println("one param");
        a = b = x;
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();        // Calls the default constructor
        A obj2 = new A(5, 10);   // Calls the two-parameter constructor
        A obj3 = new A(20);      // Calls the one-parameter constructor
    }
}
