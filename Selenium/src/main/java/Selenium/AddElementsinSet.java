package Selenium;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AddElementsinSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new LinkedHashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		for(Integer se:set)
		{
			System.out.println(se);
		}

		B b = new B();
		System.out.println(b.get("Ram"));;

	}

}

class B {
	
	public String get(String s) {
		return s;
	}
	
	public void get(Object s) {
		System.out.println(s);;
	}
}
