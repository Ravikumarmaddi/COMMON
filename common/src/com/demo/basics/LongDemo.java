package com.demo.basics;

public class LongDemo {

	public static void main(String[] args) {
		// integer literal of long type:
		long  num1 = 0L; 
		long  num2 = 4L; 
		long  mum3  = -3; 
		long  num4 = 8; 
		long  num5 = -1L;
		
		num1 = 25L;       // Decimal  format 
		num1 = 031L;      // Octal format
		num1 = 0X19L;     // Hexadecimal  format 
		num1 = 0b11001L;  // Binary   format
		
		int i = 100;
		num1 = i;
		i = (int) num1;
	}

}
