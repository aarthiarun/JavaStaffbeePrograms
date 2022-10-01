package FirstPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayExample {
public static void main(String [] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("apple");
		al.add(5);
		al.add(10.5);
		al.add('a');
		System.out.println(al);
		System.out.println(al.size());
		al.remove(2);
		System.out.println(al);
		al.add(0, "mithun");
		System.out.println(al);
		al.addAll(Arrays.asList(5, 12, 9, 3, 15, "heena"));
		System.out.println(al);
		al.set(2, "sakthi");
		System.out.println(al);
		System.out.println(al.size());
		Object data1=al.get(9);
		System.out.println(data1);	
		Object data=al.clone();
		System.out.println(data);	
		
		Iterator<Object>value=al.iterator();
		while(value.hasNext()) {
		System.out.println(value.next());	}
		
		
}}
