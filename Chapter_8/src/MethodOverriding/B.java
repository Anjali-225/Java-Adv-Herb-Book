package MethodOverriding;

public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k -- this overrides show() in A
    void show() {
        super.show(); // this call A's show()
        System.out.println("k: " + k);
    }

    // overload show()
    // Methods with differing type signatures are overloaded -- not overridden.
    void show(String msg) {
        System.out.println(msg + k);
    }
}
