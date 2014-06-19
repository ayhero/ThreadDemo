package com.alternate_execution.demo2;
/**
 * 线程切换方法
 * @author Memego-
 *
 */
public class NumberThread  implements Runnable {

	Source s=null;
	int num;
	
	public NumberThread(Source s,int num){
		this.s=s;
		this.num=num;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(num==1){
			s.print1();
		}else{
			s.print2();
		}
	}
	
}
