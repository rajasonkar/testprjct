package hacker;

public class maximumOcc {

	
	
	static  int size =256;
	public static char maxOccurChar(String s)
	{
		int countChar[] = new int[size];
		for(int i =0;i<s.length();i++)
		{
			countChar[s.charAt(i)]++;
			
		}
		
		int m = -1;
		char r = s.charAt(0);
		for(int j=0;j<s.length();j++)
		{
			if(m<countChar[s.charAt(j)])
			{
				m=countChar[s.charAt(j)];
				r=s.charAt(j);
			}
		}
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(maxOccurChar("asdssakkhjh"));
	}

}
