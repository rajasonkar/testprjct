package test.testprjct;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class WeightedString {
	// Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
	//	System.out.println(s);
		
		for(int i=0;i<s.length();i++){
	    //System.out.println(s.charAt(i));
			if(s.charAt(i)==s.charAt(i+1))
			{
				
			}
		ArrayList<String> al = new ArrayList<String>();
		//al.add(i, s.charAt(i));
 		}
		System.out.println(queries[1]);
    	return null;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter());

        String s = "abccddde";	


       /* int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
*/
        int[] queries = {1,3,12,5,9,21};

    /*    for (int i = 0; i < queries.length; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            System.out.println(queriesItem);
            queries[i] = queriesItem;
        }*/

        String[] result = weightedUniformStrings(s, queries);
System.out.println("result :"+result);
      /*  for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
*/
   //     scanner.close();
    }
}
