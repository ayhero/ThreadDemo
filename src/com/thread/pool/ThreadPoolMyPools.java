package com.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolMyPools extends Thread {

	public ThreadPoolMyPools(){
		
	}public ThreadPoolMyPools(String name){
		super(name);
	}
	
	public void run(){
		System.out.println(this.getName()+"正在执行。。。");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlockingQueue<Runnable> bdqueue =new ArrayBlockingQueue<Runnable>(20);
		ThreadPoolExecutor pool=new ThreadPoolExecutor(2,3,2,TimeUnit.MILLISECONDS,bdqueue);
		Thread t1=new Thread(new ThreadPoolMyPools("t1"));
		Thread t2=new Thread(new ThreadPoolMyPools("t2"));
		Thread t3=new Thread(new ThreadPoolMyPools("t3"));
		Thread t4=new Thread(new ThreadPoolMyPools("t4"));
		Thread t5=new Thread(new ThreadPoolMyPools("t5"));
		Thread t6=new Thread(new ThreadPoolMyPools("t6"));
		Thread t7=new Thread(new ThreadPoolMyPools("t7"));
		
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		pool.execute(t6);
		pool.execute(t7);
		
		pool.shutdown();
		
	}

}
