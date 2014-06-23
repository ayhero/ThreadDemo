package com.thread.deadlock;

public class ThreadDeadRock extends Thread {

	private DeadlockRisk dead;
	private int a,b;
	
	ThreadDeadRock(DeadlockRisk dead,int a,int b){
		this.dead=dead;
		this.a=a;
		this.b=b;
	}
	
	public void run(){
		this.dead.read();
		this.dead.write(this.a, this.b);
	}
	
}
