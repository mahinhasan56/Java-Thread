package com.FaysalBinHasan;


public class SimpleThread {
	  public static void main(String args[]) {
	   ChildThread t= new ChildThread(); // create a new thread
	   t.start();// Start the thread
	    
	      
	   for(int i = 100; i > 0; i--) {
	        System.out.println("Main Thread: " + i);
	        
	      }
	    
	    System.out.println("Main thread exiting.");
	  }
	}
	class ChildThread extends Thread
	 {
	   
	  // This is the entry point for the second thread.
	  public void run() {
	   
	      for(int i = 100; i > 0; i--) {
	        System.out.println("Child Thread: " + i);
	        
	      }
	    
	    System.out.println("Exiting child thread.");
	  }
	}

