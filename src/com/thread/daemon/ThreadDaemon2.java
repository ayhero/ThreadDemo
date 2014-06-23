package com.thread.daemon;

/**
 * 后台进程
 * @author Memego-
 *
 */
public class ThreadDaemon2 implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<100;i++){
			System.out.println("后台进程-"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
