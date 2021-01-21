package UsingSynchronizationObjects.Semaphore;
// A simple semaphore example.

import java.util.concurrent.*;

public class SemDemo {

    public static void main(String args[]) {
        Semaphore sem = new Semaphore(1);

        new Thread(new IncThread(sem, "A")).start();
        new Thread(new DecThread(sem, "B")).start();

    }
}






