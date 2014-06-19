package com.alternate_execution.demo2;

public class Source {
	/**
	 * 线程同步方法1：负责输出奇数
	 */
	synchronized void print1(){
		int num1=1;
		while(num1<101){
			System.out.println("print1:"+num1);
			num1+=2;
			try {
				Thread.sleep(1000);
				this.wait(1000);
				this.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 线程同步方法2：负责输出偶数
	 */
	synchronized void print2(){
		int num2=2;
		while(num2<101){
			System.out.println("print2:"+num2);
			num2+=2;
			try {
				Thread.sleep(1000);
				this.wait(1000);
				this.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
