package com.tedu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class hhhh {
	public static void main(String[] args) {
		ArrayList<Integer> aa=new ArrayList<>();
		aa.add(1);
		aa.add(2);
		aa.add(111);
		//System.out.println(aa);
		ArrayList<Integer>ee=new ArrayList<>();
		ee.add(22);
		ee.addAll(aa);
		ee.set(2, 111);
		//System.out.println(ee);
		
		LinkedList<Integer>cc=new LinkedList<>();
		cc.add(1);	
		cc.add(2);
		cc.add(3);
		Iterator<Integer> ccccc = cc.iterator();
		while(ccccc.hasNext()) {
			Integer e=ccccc.next();
			//System.out.println(e);
		}
		
		HashMap<Integer, String>hhhh=new HashMap<>();
		hhhh.put(1, "jackson");
		hhhh.put(1, "xuxuxux");
		Iterator<Entry<Integer, String>>huhu=hhhh.entrySet().iterator();
	}
}
