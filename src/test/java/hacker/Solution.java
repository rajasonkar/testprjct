package hacker;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'smallestString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER weight as parameter.
     */
    static ArrayList<Long> al = new ArrayList<>();
    static String finalResult = new String();
    static
    {
        al.add(1L);
        for(int i=1;i<26;i++)
        {

            al.add(((i+1)*(al.get(i-1))+al.get(i-1)));
        }
    } 

    public static String checkWt(Long wt)  // recursive method to get the sallest string
    {
        if(wt==1)
            return "A";
        if(wt > 1)
        {
        Long v = getSmallestString(wt);
        finalResult = finalResult + checkWt(wt-v)+getCharofString(v);
        }
        return finalResult;
    }

    public static String getCharofString(Long v)  // method that return the char count of Character
    {
        return ""+(char)(65+al.indexOf(v));
    }

    public static Long getSmallestString(Long wt)
    {
    	System.out.println("WT in getSmallestString :" + wt);
        for(int j = 1; j<al.size();j++)
        {
            if(al.get(j)>wt)
            {   
                System.out.println("inside"+al.get(j-1));
                return al.get(j-1);
            }
        }
        System.out.println(al.get(al.size()-1));
        return -1L;
    }
    public static String smallestString(long weight) {
    // Write your code here
        return checkWt(weight);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //long weight = Long.parseLong(bufferedReader.readLine().trim());

        String result = Result.smallestString(1515);
        System.out.print(result);
        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}