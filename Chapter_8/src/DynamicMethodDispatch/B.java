package DynamicMethodDispatch;

public class B extends A {
    // override callme()
    void callme() {
        System.out.println("Inside B's callme method");
    }
}
