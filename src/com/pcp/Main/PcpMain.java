package com.pcp.Main;

import com.pcp.IMP.PCPImp;
import com.pcp.Model.Producer;
import com.pcp.Model.consumer;

public class PcpMain {

	public static void main(String[] args) {
		PCPImp access = new PCPImp();
		Producer pro = new Producer(access);
		consumer con = new consumer(access);

	}

}
