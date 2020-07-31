import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
	
	
	/* Link: https://bit.ly/Repeated-String-Problem
	
	Lilah has a string, s, of lowercase English letters that she repeated infinitely many times.

	Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's 
	infinite string. For example, if the string s = 'abcac' and n = 10, the substring we consider 
	is 'abcacabcac', the first 10 characters of her infinite string. There are 4 occurrences of 'a'
	in the substring.
	
	*/
	
	
	/*
	 * 
	 * Input Format The first line contains a single string, s. The second line
	 * contains an integer, n.
	 * 
	 * Sample Input 0
	 * 
	 * aba 
	 * 10
	 * 
	 * Sample Output 0 
	 * 
	 * 7
	 * 
	 */

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	
    	char ch[] = s.toCharArray();
    	int count = 0;
    	int countInRemainder = 0;
    	long res = 0;
    	for(char c : ch) {
    		if(c == 'a') {
    			count++;
    		}
    	}    
		long div = n / s.length();    		

    	if(n % s.length() == 0) {
    		res = div * count;
    	} else {
    		long rem = n % s.length();
    		
    		for (int i = 0; i < rem; i++) {
    			if(ch[i] == 'a') {
    				countInRemainder++;
    			}    			
    		}
    		res = div * count + countInRemainder;
    	}
    	

    	return res;
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * bufferedWriter.close();
		 */

        scanner.close();
    }
}
