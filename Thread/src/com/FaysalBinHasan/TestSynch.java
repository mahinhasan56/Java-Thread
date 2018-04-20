package com.FaysalBinHasan;

public class TestSynch {
	 public static void main(String args[]) {

	        Counter c = new Counter();

	        ThreadDemo T1 = new ThreadDemo("Thread - 1 ", c);
	        ThreadDemo T2 = new ThreadDemo("Thread - 2 ", c);

	        T1.start();
	        T2.start();

	    }
}
class Counter {

    public void printCount(String t) {

        for (int i = 10; i > 0; i--) {
            System.out.println("Counter   ---   " + t + i);
        }

    }

}

class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;
    Counter C;

    ThreadDemo(String name, Counter C) {
        threadName = name;
        this.C = C;
        // start();
    }

    public void run() {
        synchronized (C) {
            C.printCount(threadName);
        }
       // System.out.println("Thread " + threadName + " exiting.");
    }

}
