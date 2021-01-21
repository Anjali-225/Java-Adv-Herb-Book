package UsingSynchronizationObjects.CyclicBarrier;
// An object of this class is called when the
// CyclicBarrier ends.
public class BarAction implements Runnable {
    public void run() {
        System.out.println("Barrier Reached!");
    }
}
