package com.thread.daemon;

/**
 * 前台进程
 * @author Memego-
 *
 */
public class ThreadDaemon1 extends Thread {

	@Override
	public void run() {

		for(int i=0;i<10;i++){
			System.out.println("前台进程--"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	

}
