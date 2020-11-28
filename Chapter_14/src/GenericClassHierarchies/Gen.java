package GenericClassHierarchies;
// A simple generic class hierarchy.
//public class Gen<T> {
//    T ob;
//
//    Gen(T o) {
//        ob = o;
//    }
//
//    // Return ob.
//    T getob() {
//        return ob;
//    }
//}

// A subclass can add its own type parameters.
public class Gen<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}
