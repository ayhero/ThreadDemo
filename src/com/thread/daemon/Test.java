package com.thread.daemon;

/**
 * 守护进程测试
 * @author Memego-
 *
 */
public class Test {

	public static void main(String[] args) {

		Thread t1=new Thread(new ThreadDaemon1());
		Thread t2=new Thread(new ThreadDaemon2());
		t2.setDaemon(true);
		
		t1.start();
		t2.start();

	}

}
