package com.demo.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

public class CSVDemo {
	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(
				new FileReader(
						"C:/dev/poc1/Demo/src/com/demo/csv/Filter_Metric_2015_05_21.csv"));
		String line = null;
		HashMap<String, String> map = new HashMap<String, String>();

		while ((line = br.readLine()) != null) {
			String str[] = line.split("  ");
			if (str.length == 2) {
				System.out.println(str[0] + "________" + str[1]);
				map.put(str[0], str[1]);
			}
		}
		System.out.println(map);
	}
}