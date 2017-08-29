package com;


public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {

		RunnableJob runnableJob = new RunnableJob();

		Thread thread1 = new Thread(runnableJob, "T1");
		Thread thread2 = new Thread(runnableJob, "T2");
		Thread thread3 = new Thread(runnableJob, "T3");
		Thread thread4 = new Thread(runnableJob, "T4");

		thread1.start();
		thread1.join();		
		thread2.start();
		thread2.join();
		thread3.start();
//		thread3.join();
		thread4.start();
//		thread4.join();


	}

}