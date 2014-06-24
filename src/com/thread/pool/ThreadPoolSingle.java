package com.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolSingle extends Thread {
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"正在执行。。。");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService pool=Executors.newSingleThreadExecutor();
		pool.execute(new ThreadPoolSingle());
		pool.execute(new ThreadPoolSingle());
		pool.execute(new ThreadPoolSingle());
		pool.execute(new ThreadPoolSingle());
		pool.execute(new ThreadPoolSingle());
		
		pool.shutdown();
	}

}
