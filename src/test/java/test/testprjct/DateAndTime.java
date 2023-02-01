package test.testprjct;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import org.testng.annotations.Test;
public class DateAndTime {

	@Test
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{/*String s ="hello world";int k =3;
		 int lengthOfstring = s.length();
		 SortedSet<String> ts = new TreeSet<String>();
	     for(int i =0;i<=lengthOfstring-k;i++){
		 if(lengthOfstring>=k)
	        {
	            ts.add(s.substring(i, i+k));
	           
	        }
	     }
	     System.out.println(ts);	
	     System.out.println(ts.first());
	     System.out.println(ts.last());*/
		/*String A = "madam";
		 char[] ch = A.toCharArray();
	     System.out.println(ch.length);  
	     String st = null;
	     for(int i =0;i<ch.length;i++)
		 { System.out.println(ch[i]);
	    	 char c = ch[i];
	            char cl = ch[ch.length-i-1];
	            if(c==cl){
	       st   = "yes";}
	            else{st = "no";}
	            */
	           
		// }
			// System.out.println(st);;
		String a = "anagramm";
		String b= "marganaa";
		
		/*char[] ch1 = a.toCharArray();
        SortedMap<Character, Integer> sm1 = new TreeMap<Character,Integer>(); 
      
        for(int i=0;i<ch1.length;i++)
        {Integer count =1;
        if(sm1.containsKey(ch1[i])){
            sm1.put(ch1[i],sm1.get(ch1[i])+1);
        }else{
        	sm1.put(ch1[i],count);
        }
        }
        char[] ch2 = b.toCharArray();
        SortedMap<Character, Integer> sm2 = new TreeMap<Character,Integer>(); 
      
        for(int j=0;j<ch2.length;j++)
        {Integer count2 =1;
        if(sm2.containsKey(ch2[j])){
            sm2.put(ch2[j],sm2.get(ch2[j])+1);
        }else{
        	sm2.put(ch2[j],count2);
        	
        }
        }
	*/
		char[] ch1 = a.toLowerCase().toCharArray();
		char[] ch2 = b.toCharArray();
		if(ch1.length!=ch2.length)
		//return false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i =0;i<ch1.length;i++)
		{System.out.println(ch1[i]+","+ch2[i]);
		    if(ch1[i]!=ch2[i])
		   // return false;
		    	System.out.println("f");
		    else
		    	System.out.println("t");
		//    return true;
		}
       // System.out.println(sm1);
       // System.out.println(sm2);
       // System.out.println(sm1.equals(sm2));
		/*String s="He is a very very good boy, isn't he?";
		if(s.equals(null)){}
		String st= "[ ?,']+";
		String[] str = s.split(st);
	System.out.println(str.length);
		for(int i = 0 ; i<str.length;i++)
		 System.out.println(str[i]);*/
		String s="";
		  if(s.length()>0){
		        
		       String st= "[ \\!,?._'@]+";
		        String[] str = s.trim().split(st);
		    System.out.println(str.length);
		        for(int i = 0 ; i<str.length;i++)
		         System.out.println(str[i]);
		        }else if(s==""){ System.out.println("0");}
		  
		  String a1 = "Love";  
	        String b1 = "You";  
	        System.out.println("Before swap: " + a1 + " " + b1);  
	        a1 = a1 + b1;  
	        System.out.println(a1);
	        b1 = a1.substring(0, a1.length() - b1.length());  
	        System.out.println(a1.length() - b1.length());
	        a1 = a1.substring(b1.length());  
	        System.out.println("After : " + a1 + " " + b1);
		  
		  
}


}