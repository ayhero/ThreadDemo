package com.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadCallable implements Callable {

	private String name;
	public ThreadCallable(){}
	public ThreadCallable(String name){
		this.name=name;
	}
	
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return this.name+"任务返回的内容";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService pool=Executors.newFixedThreadPool(2);
		Callable c1=new ThreadCallable("c1");
		Callable c2=new ThreadCallable("c2");
		
		Future f1=pool.submit(c1);
		Future f2=pool.submit(c2);
		
		try {
			System.out.println(">>>"+f1.get().toString());
			System.out.println(">>>"+f2.get().toString());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pool.shutdown();
		
	}
	

}
