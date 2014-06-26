package com.thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSingleScheduled extends Thread {

	public ThreadPoolSingleScheduled(){
		
	}
	public ThreadPoolSingleScheduled(String name){
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
		ScheduledExecutorService pool=Executors.newSingleThreadScheduledExecutor();
		Thread t1=new Thread(new ThreadPoolSingleScheduled("t1"));
		Thread t2=new Thread(new ThreadPoolSingleScheduled("t2"));
		Thread t3=new Thread(new ThreadPoolSingleScheduled("t3"));
		Thread t4=new Thread(new ThreadPoolSingleScheduled("t4"));
		Thread t5=new Thread(new ThreadPoolSingleScheduled("t5"));
		
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		//pool.execute(t4);
		//pool.execute(t5);
		
		//使用延迟执行风格的方法
		pool.schedule(t4, 10, TimeUnit.MICROSECONDS);
		pool.schedule(t5, 10, TimeUnit.MICROSECONDS);
		pool.shutdown();
	}

}
