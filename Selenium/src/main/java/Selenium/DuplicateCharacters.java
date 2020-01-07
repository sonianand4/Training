package Selenium;

import java.util.HashMap;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class DuplicateCharacters {
	public static String duplicatecharcount(String input)
	{
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		char[] inputarray=input.toCharArray();
		for(char ch:inputarray)
		{
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
			Set<Character> keyset = map.keySet();
			{
				for(Character c: keyset)
				{
					if(map.get(c)>1)
					{
						System.out.println(c+":"+map.get(c));
					}
				}
			}
				
			
		
		
				
		return null;
	}
	public static void main(String[] args)
	{
		String instring="Bitter Butter";
		duplicatecharcount(instring);
		
	}

}
