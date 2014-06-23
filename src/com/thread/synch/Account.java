package com.thread.synch;
/**
 * 线程同步实体用例
 * @author Memego-
 *
 */
public class Account {

	private String code;
	private int cash;
	
	public Account(String code,int cash){
		this.code=code;
		this.cash=cash;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 业务方法
	 * @param x 添加x万元
	 */
	public synchronized void oper(int x){
		
		try {
			Thread.sleep(10L);
			this.cash+=x;
			System.out.println(Thread.currentThread().getName()+"运行结束，增加"+x+"万元，用户账户余额为:"+this.cash);
			Thread.sleep(10L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 业务方法--同步块
	 * @param x 添加x万元
	 */
	public void oper_block(int x){
		
		try {
			Thread.sleep(10L);
			synchronized(this){
				this.cash+=x;
				System.out.println(Thread.currentThread().getName()+"运行结束，增加"+x+"万元，用户账户余额为:"+this.cash);
				
			}
			Thread.sleep(10L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String toString(){
		return "User{"+"code='"+this.code+"'\",cash="+this.cash+"}";
	}
	
}
