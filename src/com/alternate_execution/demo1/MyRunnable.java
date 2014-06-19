package com.alternate_execution.demo1;
/**
 * 线程类1:负责输出偶数
 * @author Memego-
 *
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=2;i<100;i=i+2){
			System.out.println("print2:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
