package com.pcp.Model;

import com.pcp.IMP.PCPImp;

public class consumer implements Runnable{
	PCPImp consumer;
	public consumer(PCPImp consm){
		this.consumer = consm;
		Thread Thread_con = new Thread(this);
		Thread_con.start();
	}
	@Override
	public void run() {
		while(true){
			int consumer_request = consumer.get();
			
		}
		
	}
}
