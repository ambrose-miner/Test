package com.game;

public class Car implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name);
		for(int i=0;i<10;i++) {
			System.out.println(name+" "+i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}