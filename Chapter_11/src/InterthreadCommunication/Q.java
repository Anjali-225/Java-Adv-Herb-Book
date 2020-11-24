package InterthreadCommunication;
//// An incorrect implementation of a producer and consumer.
//public class Q {
//    int n;
//
//    synchronized int get() {
//        System.out.println("Got: " + n);
//        return n;
//    }
//
//    synchronized void put(int n) {
//        this.n = n;
//        System.out.println("Put: " + n);
//    }
//}

// A correct implementation of a producer and consumer.
class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while(!valueSet)
            try {
                wait();

            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while(valueSet)
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}