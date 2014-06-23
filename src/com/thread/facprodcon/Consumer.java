package com.thread.facprodcon;
/**
 * 消费者
 * @author Memego-
 *
 */
public class Consumer extends Thread {

	private int needNum;//生产产品的数量
	private Godown godown;//仓库
	
	Consumer(int needNum,Godown godown){
		this.needNum=needNum;
		this.godown=godown;
	}
	
	public void run(){
		this.godown.consume(this.needNum);
	}
	
	
}
