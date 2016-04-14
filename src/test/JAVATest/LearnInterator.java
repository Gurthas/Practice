package test;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnInterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");	
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
		String str= iter.next();
		System.out.println(str);
		}
	}

}
