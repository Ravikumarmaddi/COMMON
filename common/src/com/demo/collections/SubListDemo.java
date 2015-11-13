package com.collections;

import java.util.ArrayList;

public class SubListDemo {

	public static void main(String[] args) {
		ArrayList<String> emailList = new ArrayList<String>();
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		emailList.add("444");
		emailList.add("555");
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		emailList.add("444");
		emailList.add("555");
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		emailList.add("444");
		emailList.add("555");
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		emailList.add("444");
		emailList.add("555");
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		emailList.add("444");
		emailList.add("555");
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		emailList.add("444");
		emailList.add("555");
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		emailList.add("444");
		emailList.add("555");
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		emailList.add("444");
		emailList.add("555");
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		emailList.add("444");
		emailList.add("555");
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		emailList.add("444");
		emailList.add("555");
		emailList.add("111");
		emailList.add("222");
		emailList.add("333");
		
		int chunk10s = emailList.size()%10 == 0? emailList.size()/10:emailList.size()/10 +1;
		ArrayList<String> subList = null;
		System.out.println("Size " + emailList.size());
		int from =0;
		int to= 0;
		for (int i = 0; i < chunk10s; i++) {
			from = i*10;
			to = (i+1)*10 < emailList.size()? (i+1)*10: emailList.size();
			System.out.println(from +"   "+ to);
			subList = new ArrayList<String>(emailList.subList(from,to));
			System.out.println(subList.toString());
		}
	}
}
