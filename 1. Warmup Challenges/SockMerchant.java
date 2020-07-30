import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {
	
	/*
	 *  Sample Input
	 *		9
	 *		10 20 20 10 10 30 50 10 20
	 * 
	 *  Sample Output:
	 *     3
	 * 
	 * */
	
	/*
		John works at a clothing store. He has a large pile of socks that he
		must pair by color for sale. Given an array of integers representing 
		the color of each sock, determine how many pairs of socks with matching
		colors there are.

		For example, there are n = 7 socks with colors ar = { 1,2,1,2,1,3,2}. 
		There is one pair of color 1 and one of color 2. There are three odd 
		socks left, one of each color. The number of pairs is 2.
		
		
	*/

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int totalCount = 0;
        int count = 0;
        HashMap<Integer, Integer> eachSochCount = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < n; i++) {
            if(eachSochCount.containsKey(ar[i])) {
                eachSochCount.put(ar[i], eachSochCount.get(ar[i])+1);
            }else {
                eachSochCount.put(ar[i], 1);
            }
        }
        for(Map.Entry eachSet: eachSochCount.entrySet()) {
            count = 0;
            if((int)eachSet.getValue() >= 2) {
                count = (int)eachSet.getValue() / 2;
            }
            totalCount += count;
        }
        
        return totalCount;
    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

      //  bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

      //  bufferedWriter.close();

        scanner.close();
    }
}
