package com.demo.seriolizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Crunchify.com
 */

public class WaysToCreateObjectDemo {

	public WaysToCreateObjectDemo() {

	}

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {

		// Create Object1
		Account object1 = new Account(1, "Ravi", 874873);

		// Create Object2
		Account object2 = (Account) Class.forName(
				"com.demo.seriolizable.Account").newInstance();

		// Create Object3
		Account object3 = (Account) object1.clone();
		if (object3 != null)
			System.out.println("Hello! Account() just got created..");
		else
			System.out.println("NOT ... Hello! Account() just got created..");

		// Create Object4
		Object object4 = Account.class.getClassLoader()
				.loadClass("com.demo.seriolizable.Account").newInstance();

		// Create Object5
		// create a new file with an ObjectOutputStream
		FileOutputStream out = new FileOutputStream("Account.txt");
		ObjectOutputStream oout = new ObjectOutputStream(out);

		// write something in the file
		oout.writeObject(object3);
		oout.flush();

		// create an ObjectInputStream for the file we created before
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"Account.txt"));
		Account object5 = (Account) ois.readObject();
		if (object5 != null)
			System.out.println("Hello! Account() just got created..");
		else
			System.out.println("NOT ... Hello! Account() just got created..");
	}
}

class Account implements Cloneable, Serializable {
	private static final long serialVersionUID = -3607010897006503382L;
	int acnum;
	String name;
	double balance;

	public Account() {
		System.out.println("Hello! Account() just got created..");
	}

	public Account(int acnum, String name, double balance) {
		super();
		this.acnum = acnum;
		this.name = name;
		this.balance = balance;
		System.out.println("Hello! Account() just got created..");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Account) super.clone();
	}

	public int getAcnum() {
		return acnum;
	}

	public void setAcnum(int acnum) {
		this.acnum = acnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}