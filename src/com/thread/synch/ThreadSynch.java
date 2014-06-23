package com.thread.synch;

/**
 * 线程类，操作账户ac
 * @author Memego-
 *
 */
public class ThreadSynch extends Thread {

	private Account ac;
	private int y=0;
	
	ThreadSynch(String name,Account ac,int y){
		super(name);
		this.ac=ac;
		this.y=y;
		
	}
	
	public void run(){
		//ac.oper(y);
		ac.oper_block(y);
	}
	
}
