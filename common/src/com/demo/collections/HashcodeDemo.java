package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashcodeDemo {
	public static void main1(String[] args) {
		System.out.println("aaaaaaaaaaaaa");
	}
	public static void main(String[] args) {
          ArrayList<Emp> l = new ArrayList<Emp>();
          HashSet<Emp> s = new HashSet<Emp>();
         /* Emp e1 = new Emp("aaa");
          Emp e2 = new Emp("bbb");
          Emp e3 = new Emp("ccc");
          Emp e4 = new Emp("ddd");
          Emp e5 = new Emp("eee");
          Emp e6 = new Emp("fff");
          Emp e7 = new Emp("ggg");
         */
          Emp e1 = new Emp();
          Emp e2 = new Emp();
          Emp e3 = new Emp();
          Emp e4 = new Emp();
          Emp e5 = new Emp();
          Emp e6 = new Emp();
          Emp e7 = new Emp();
         /* if(e1 == e2)
        	  System.out.println("e1 == e2");
          else
        	  System.out.println("e1 != e2");
	  
        */  
          l.add(e1);
          l.add(e2);
          l.add(e3);
          l.add(e4);
          l.add(e5);
          l.add(e6);
          l.add(e7);
          l.add(e1);
          l.add(e1);
          
          s.add(e1);
          s.add(e2);
          s.add(e3);
          s.add(e4);
          s.add(e5);
          s.add(e6);
          s.add(e7);
          s.add(e1);
          s.add(e1);
          
          System.out.println(l.size());
          System.out.println(s.size());
                  
	}
}

class Emp {
	//String name;

	/*public Emp(String name) {
		super();
		this.name = name;
	}*/

	@Override
	public int hashCode() {
		/*System.out.println("hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());*/
		return 0;
	}

	/*@Override
	public boolean equals(Object obj) {
		System.out.println("equels");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/

	
}
