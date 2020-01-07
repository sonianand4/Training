package Selenium;

import java.util.HashMap;
import java.util.Set;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abcd";
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(1,"a");
		map.put(2,"b");
		map.put(3,"c");
		map.put(4,"d");
		map.put(5,"e");
		Set<Integer> set = map.keySet();
		for(Integer se:set)
		{
			String string = map.get(se+1);
			if(string!=null)
			{
			System.out.print(string);}
		}
		

	}

}