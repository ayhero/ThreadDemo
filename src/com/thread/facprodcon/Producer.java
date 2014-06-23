package com.thread.facprodcon;
/**
 * 生产者
 * @author Memego-
 *
 */
public class Producer extends Thread {

	private int needNum;//生产产品的数量
	private Godown godown;//仓库
	
	Producer(int needNum,Godown godown){
		this.needNum=needNum;
		this.godown=godown;
	}
	
	public void run(){
		this.godown.produce(needNum);
	}
	
}
