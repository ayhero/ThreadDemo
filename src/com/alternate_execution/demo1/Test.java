package com.alternate_execution.demo1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new MyThread1();
		Thread t2=new Thread(new MyRunnable());
		//Thread t2=new MyThread2();
		t1.setPriority(10);//设置线程优先级，10级为最高级
		t2.setPriority(1);
		
		t2.start();
		t1.start();
	}

}
