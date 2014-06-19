package com.alternate_execution.demo2;

public class Test {

	public static void main(String[] args){
		Source s=new Source();
		NumberThread nt1=new NumberThread(s,1);
		NumberThread nt2=new NumberThread(s,2);
		
		Thread t1=new Thread(nt1);
		Thread t2=new Thread(nt2);

		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
		
	}
}
