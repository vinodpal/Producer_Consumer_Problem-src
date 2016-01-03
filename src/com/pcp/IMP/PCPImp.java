package com.pcp.IMP;

public class PCPImp {
	int n;
	boolean ValSet = false;
	synchronized public void put(int i){
		try{
			if(ValSet){
				wait();
			}
		}catch(InterruptedException ie){
			System.out.println("Problem in thread Execuation");
		}
		n = i;
		System.out.println("Put : " +n);
		ValSet = true;
		notify();
	}
	synchronized public int get(){
		try {
			if(!ValSet){
				wait();
			}
		}catch(InterruptedException ie){
			System.out.println("Problem in Thread Executation");
		}
		System.out.println("Got : " + n);
		ValSet = false;
		notify();
		return (n);
	}
}
