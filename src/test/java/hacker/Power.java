package hacker;

import java.util.ArrayList;
import java.lang.Math.*;
public class Power {

	private static int raisingPow(ArrayList<Integer> al)
	{
		Long maxVal = -1L;
		int index = -1;
		for(int i=0;i< al.size()-1;i++)
		{
			Long value = getValue(al.get(i),al.get(i+1));
			if(maxVal<value)
			{
				maxVal= value;
				index =i;
			}
		}
		return index;
		
	}
	
	private static Long getValue(int value, int pow){
	   {
		return Math.round((Math.pow(value, pow)%1000000007));
	   } 
     }
	
	public static void main(String args[])
	{ArrayList<Integer> al = new ArrayList<>();
	al.add(3);
	al.add(2);
	al.add(3);
	al.add(4);
		System.out.println(raisingPow(al));
	}
	}
