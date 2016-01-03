package com.pcp.Model;

import com.pcp.IMP.PCPImp;

public class Producer implements Runnable{
	PCPImp prodcut;
	public Producer(PCPImp pro){
		this.prodcut = pro;
		Thread Thread_Pro = new Thread(this); 
		Thread_Pro.start();
	}
	@Override
	public void run() {
		int No_product = 0;
		while(true){
			prodcut.put(++No_product);
		}
		
	}
}
