package RunTimeTypeComparisonsWithinAGenericHierarchy;
// Use the instanceof operator with a generic class hierarchy.
public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }
}
