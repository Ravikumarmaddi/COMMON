package com.demo.basics;

public class CharDemo {

	public static void main(String[] args) {
		//char variables using this form:
			char   c1  = 'A'; 
			char   c2  = 'L'; 
			char   c3  = '5'; 
			char   c4  = '/';
			
			//character escape sequences.

			char   c5  = '\n'; // Assigns a linefeed to c1 
			char   c6  = '\"'; // Assigns double quote to c2

			// Unicode escape sequence in the form .
			//Here, denotes the start of the Unicode escape sequence, and xxxx represents exactly four hexadecimal digits.
			char c7  = 'A';
			char c8  = '\u0041'; // Same as  c2  = 'A'
			
			char   c9  = 97;  // Same as  
			c9  = 'a'; 
			c9  = '\141'; 
			c9  = '\u0061';
	}

}
