package com.thread.synch;

/**
 * 线程同步测试
 * @author Memego-
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account("张三",100);
		Thread t1=new Thread(new ThreadSynch("线程A",ac,20));
		Thread t2=new Thread(new ThreadSynch("线程B",ac,-60));
		Thread t3=new Thread(new ThreadSynch("线程C",ac,-80));
		Thread t4=new Thread(new ThreadSynch("线程D",ac,-30));
		Thread t5=new Thread(new ThreadSynch("线程E",ac,32));
		Thread t6=new Thread(new ThreadSynch("线程F",ac,21));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
	}

}
