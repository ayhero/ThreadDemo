package com.alternate_execution.demo1;
/**
 * 线程类2：负责输出奇数
 * @author Memego-
 *
 */
public class MyThread1 extends Thread {

	public void run(){
		for(int i=1;i<100;i=i+2){
			System.out.println("print1:"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
