package com.thread.facprodcon;

/**
 * 仓库
 * @author Memego-
 *
 */
public class Godown {

	public static final int max_size=100;//最大库存量
	public int curnum;//当前库存量
	
	Godown(){
		
	}
	Godown(int curnum){
		this.curnum=curnum;
	}
	
	/**
	 * 生产指定数量的产品
	 * @param needNum
	 */
	public synchronized void produce(int needNum){
		while(needNum+curnum>max_size){
			System.out.println("要生产的产品数量"+needNum+"超过剩余库存量"+(max_size-curnum)+",暂时不能执行生产任务！");
			try {
				this.wait();//当前的生产线程等待
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//满足生产条件，则进行生产，这里简单的更改当前库存量
		this.curnum+=needNum;
		System.out.println("已经生产了"+needNum+"个产品，现在仓储量为"+this.curnum);
		this.notifyAll();
	}
	/**
	 * 消费指定数量的产品
	 * @param needNum
	 */
	public synchronized void consume(int needNum){
		
		//测试是否可消费
		while(this.curnum<needNum){
			try {
				this.wait();//当前的消费线程等待
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.curnum-=needNum;
		System.out.println("已经消费了"+needNum+"个产品，现仓储量为:"+this.curnum);
		this.notifyAll();
		
	}
	
}
