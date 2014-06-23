package com.thread.join;
/**
 * 线程join例子
 * 参考链接:http://lavasoft.blog.51cto.com/62575/221817
 * @author Memego-
 *
 */
public class ThreadJoin extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			System.out.println("子线程-"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		Thread t1=new Thread(new ThreadJoin());
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println("主线程--"+i);
			if(i>2){
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
}
