package GenericClassHierarchies.AGenericSubclass;
// A nongeneric class can be the superclass
// of a generic subclass.

// A nongeneric class.
public class NonGen {
    int num;

    NonGen(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}