package test.testprjct;

import java.util.ArrayList;
import java.util.HashMap;

public class InstanceOf {

	
	public static void main(String [] args)
	{
		HashMap<String, String> hm = new HashMap<>();
		hm.put("a", "rfc");
		System.out.println(hm.put("a", "value"));
		System.out.println(hm);
		int a = 0,b = 0,c = 0;
		int d= 10;
		int e = 20;
		String s = "str1";
		String s2 = "str2";
		System.out.println(d+e+s+s2);
		System.out.println(s+s2+(d+e));
		System.out.println(s+s2+d+e);
		ArrayList mylist = new ArrayList();
		mylist.add("Student");
		mylist.add("Rockstar");
		mylist.add("Hacker");
		mylist.add("Student");
		mylist.add("Student");
	      for(int i = 0; i < mylist.size(); i++){
	         Object element=mylist.get(i);
	         System.out.println(element.toString());
	         if(element.equals("Student"))
	            a++;
	         if(element.equals("Rockstar"))
	            b++;
	         if(element.equals("Hacker"))
	            c++;
	      }
	      System.out.println(a+" " +b+" " +c);
	     int n=20;
	          int sum =0;
	          for (int i =1 ;i<=n;i++)
	          {
	              if((n%i)==0)
	              {
	                 sum = sum+i;
	                 System.out.println(sum);
	              }
	          
	          // return sum;
	       }
	} 
}
