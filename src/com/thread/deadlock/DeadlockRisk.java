package com.thread.deadlock;

public class DeadlockRisk {

	private static class Resource{
		public int value;
	}
	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();
	
	public int read(){
		synchronized(resourceA){
			System.out.println("read():"+Thread.currentThread().getName()+"获取了resourceA的锁");
			synchronized(resourceB){
				System.out.println("read():"+Thread.currentThread().getName()+"获取了resourceB的锁");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return resourceB.value+resourceA.value;
			}
		}
	}
	
	public void write(int a,int b){
		synchronized(resourceB){
			System.out.println("write():"+Thread.currentThread().getName()+"获取了resourceB的锁");
			synchronized(resourceA){
				System.out.println("write():"+Thread.currentThread().getName()+"获取了resourceA的锁");
				resourceA.value=a;
				resourceB.value=b;
			}
		}
	}
	
}
