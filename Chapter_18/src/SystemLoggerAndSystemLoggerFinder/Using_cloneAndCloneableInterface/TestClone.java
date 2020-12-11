package SystemLoggerAndSystemLoggerFinder.Using_cloneAndCloneableInterface;
//// Demonstrate the clone() method.
//
//public class TestClone implements Cloneable {
//    int a;
//    double b;
//
//    // This method calls Object's clone().
//    TestClone cloneTest() {
//        try {
//            // call clone in Object.
//            return (TestClone) super.clone();
//        } catch(CloneNotSupportedException e) {
//            System.out.println("Cloning not allowed.");
//            return this;
//        }
//    }
//}

// Override the clone() method.

public class TestClone implements Cloneable {
    int a;
    double b;

    // clone() is now overridden and is public.
    public Object clone() {
        try {
            // call clone in Object.
            return super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("Cloning not allowed.");
            return this;
        }
    }
}
