package test.testprjct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurance {
	
public static void main (String args[]){
	//Scanner scanner = new Scanner(System.in);
	//String s = scanner.next();
	//int myInt = scanner.nextInt();
	//scanner.close();
//	Scanner scan= new Scanner(System.in);
	
//	int myInt = scan.nextInt();
//	scan.close();
	//System.out.println(s);
	String s ="my namme is java hello a";
	int v =1,myInt =2;
	ArrayList<Object> l = new ArrayList<>();
	HashMap<Character ,Integer> h = new HashMap<>();
	for(int i=0;i<s.length() ;i++)
	{
		char st = s.charAt(i);	
		if(h.containsKey(st))
		{
			h.put(st, h.get(st)+1 );
			
		}else
		{h.put(st, v);
			
		}
		
		
	}
	//for(Map.Entry e : h.entrySet())
       System.out.println(h);  
	/*{if(e.getValue() != null&&e.getValue()==(Object)myInt)
	{l.add(e.getKey());}
	}*/
//	System.out.println(h);
	for(int i = 0; i<l.size();i++)
	{
		System.out.print(l.get(i));		
	}

}
}
