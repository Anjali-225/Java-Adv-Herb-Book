package Interfaces;

public class TestIface2 {
    public static void main(String args[]) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob; // c now refers to AnotherClient object
        c.callback(42);
    }
}
