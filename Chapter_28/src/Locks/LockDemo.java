package Locks;
// A simple lock example.

import java.util.concurrent.locks.*;

public class LockDemo {

    public static void main(String args[]) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(new LockThread(lock, "A")).start();
        new Thread(new LockThread(lock, "B")).start();

    }
}