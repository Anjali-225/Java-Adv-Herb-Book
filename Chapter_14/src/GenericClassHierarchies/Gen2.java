package GenericClassHierarchies;
// A subclass of Gen.
//public class Gen2<T> extends Gen<T> {
//    Gen2(T o) {
//        super(o);
//    }
//}

// A subclass of Gen that defines a second
// type parameter, called V.
public class Gen2<T, V> extends Gen<T> {
    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getob2() {
        return ob2;
    }
}
