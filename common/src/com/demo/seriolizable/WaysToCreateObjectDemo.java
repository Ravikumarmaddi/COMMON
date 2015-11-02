package com.demo.seriolizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
/**
 * @author Crunchify.com
 */
 
public class WaysToCreateObjectDemo implements Cloneable, Serializable {
 
	private static final long serialVersionUID = 1L;
 
	public WaysToCreateObjectDemo() {
		System.out.println("Hello! WaysToCreateObjectDemo() just got created..");
	}
 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (WaysToCreateObjectDemo) super.clone();
	}
 
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
 
		// Create Object1
		WaysToCreateObjectDemo object1 = new WaysToCreateObjectDemo();
 
		// Create Object2
		WaysToCreateObjectDemo object2 = (WaysToCreateObjectDemo) Class.forName("com.demo.seriolizable.WaysToCreateObjectDemo").newInstance();
 
		// Create Object3
		WaysToCreateObjectDemo secondObject = new WaysToCreateObjectDemo();
		WaysToCreateObjectDemo object3 = (WaysToCreateObjectDemo) secondObject.clone();
 
		// Create Object4
		Object object4 = WaysToCreateObjectDemo.class.getClassLoader().loadClass("com.demo.seriolizable.WaysToCreateObjectDemo").newInstance();
 
		// Create Object5
		// create a new file with an ObjectOutputStream
		FileOutputStream out = new FileOutputStream("WaysToCreateObjectDemo.txt");
		ObjectOutputStream oout = new ObjectOutputStream(out);
 
		// write something in the file
		oout.writeObject(object3);
		oout.flush();
 
		// create an ObjectInputStream for the file we created before
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("WaysToCreateObjectDemo.txt"));
		WaysToCreateObjectDemo object5 = (WaysToCreateObjectDemo) ois.readObject();
		if(object5 != null)
			System.out.println("Hello! WaysToCreateObjectDemo() just got created..");
	}
}