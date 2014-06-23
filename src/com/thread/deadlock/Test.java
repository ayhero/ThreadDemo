package com.thread.deadlock;
/**
 * 死锁测试用例
 * @author Memego-
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeadlockRisk dead=new DeadlockRisk();
		Thread t1=new ThreadDeadRock(dead,1,2);
		Thread t2=new ThreadDeadRock(dead,3,4);
		Thread t3=new ThreadDeadRock(dead,5,6);
		Thread t4=new ThreadDeadRock(dead,7,8);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

}
