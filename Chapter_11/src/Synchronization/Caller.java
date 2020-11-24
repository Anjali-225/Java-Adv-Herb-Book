package Synchronization;

public class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

  public Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

//    public void run() {
//        target.call(msg);
//    }

    // synchronize calls to call()
    public void run() {
        synchronized(target) { // synchronized block
            target.call(msg);
        }
    }
}
