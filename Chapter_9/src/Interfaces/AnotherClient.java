package Interfaces;

// Another implementation of Callback.
public class AnotherClient implements CallBack {
    // Implement Callback's interface
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
