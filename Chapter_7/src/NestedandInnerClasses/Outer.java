package NestedandInnerClasses;
// Demonstrate an inner class.
public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an inner class
    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}

//// Define an inner class within a for loop.
//class Outer {
//    int outer_x = 100;
//
//    void test() {
//        for(int i=0; i<10; i++) {
//            class Inner {
//                void display() {
//                    System.out.println("display: outer_x = " + outer_x);
//                }
//            }
//            Inner inner = new Inner();
//            inner.display();
//        }
//    }
//}

