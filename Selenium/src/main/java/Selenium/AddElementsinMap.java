
package Selenium;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AddElementsinMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1,1);
		map.put(2,2);
		map.put(3,3);
		map.put(4,4);
		map.put(5,5);
	//System.out.println(Arrays.asList(map));
		
		System.out.println(Collections.singletonList(map));
		
		Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		for(Entry<Integer,Integer> se:entrySet )
		{
			System.out.println(se.getKey()+","+se.getValue());
		}
		Set<Integer> keySet = map.keySet();
		for(Integer key:keySet)
		{
			map.get(key);
			System.out.println(key+","+map.get(key));
		}
			
		

	}

}
