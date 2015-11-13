package com.demo.basics;

public class UnderscoresNumericLiterals {
	public static void main(String[] args) {
		int x1  = 2_014;     // Underscore in  deciaml format
		int x2  = 2___014;   // Multiple consecutive underscores 
		int x3  = 02_014;    // Underscore in  octal literal
		int x4  = 0b0111_1011_0001;  // Underscore in binary literal
		int x5  = 0x7_B_1;           // Underscores in hexadecimal literal 
		byte b1 = 1_2_7;             // Underscores in decimal format 
		double d1 = 2_014.01_11;     // Underscores in double literal
	}

}
