package com.study.springboot.multi;

public class PrinterA implements Printer {

	@Override
	//"Hello"+name+":"+nickname
	public void print(String msg) {
		System.out.println("printerA : "+msg);

	}

}
