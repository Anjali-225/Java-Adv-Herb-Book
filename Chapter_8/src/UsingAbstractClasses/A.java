package UsingAbstractClasses;
// A Simple demonstration of abstract.
public abstract class A {
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}