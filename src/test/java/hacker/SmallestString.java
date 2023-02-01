package hacker;

import java.util.ArrayList;
import java.util.List;

public class SmallestString {

	static ArrayList<Long> al = new ArrayList<>();
	static{
		al.add(1L);
		for(int i =1;i<26;i++)
		{
			al.add(((i+1)*(al.get(i-1))+al.get(i-1)));
		}
		System.out.println(al);
	}

	public static String smallestString(Long wt){
		
		return chkWt(wt);
		}

	public static String chkWt(Long wt){
		if(wt==1)
		{
			return "A";
			
		}
		Long v = getSallest(wt);
		return ""+chkWt(wt-v)+getCharOfString(v);
		}
	
	
	
	private static String getCharOfString(Long v) {
		
		return ""+(65+al.indexOf(v));
	}

	private static Long getSallest(Long v) {
		 
		for(int j=1;j<al.size();j++)
		{
			if(al.get(j)>v)
			{
		
		    return al.get(j-1);
	        }
		}
		return v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
