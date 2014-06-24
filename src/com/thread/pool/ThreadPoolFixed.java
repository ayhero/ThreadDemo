package com.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 固定线程数
 * @author Memego-
 *
 */
public class ThreadPoolFixed extends Thread{

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
		ExecutorService pool=Executors.newFixedThreadPool(2);
		pool.execute(new ThreadPoolFixed());
		pool.execute(new ThreadPoolFixed());
		pool.execute(new ThreadPoolFixed());
		pool.execute(new ThreadPoolFixed());
		pool.execute(new ThreadPoolFixed());
		pool.execute(new ThreadPoolFixed());
		
		pool.shutdown();
		
	}

}
