package SomeGenericRestrictions;
// Can't create an instance of T.
public class Gen<T> {
    T ob;
    Gen() {
//        ob = new T(); // Illegal!!!
    }
}

