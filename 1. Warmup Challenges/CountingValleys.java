import java.io.IOException;
import java.util.Scanner;
public class CountingValleys {

	
	// Problem Link : https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

	/**
	 *  INPUT:  8
	 *			UDDDUDUU
	 * 
	 *  OUTPUT: 1
	 * 
	 */
	
	/*  Explanation
	
	If we represent _ as sea level, a step up as /, and a step down as \, Gary's hike can be drawn as:

	_/\      _
	   \    /
	    \/\/
	He enters and leaves one valley.
	
	*/
	
    // Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

		char ch[] = s.toCharArray();
		int maxLevel = 0, valleyCount = 0;
		int level = 0;
		// boolean belowSeaLevel = false;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'U') {
				level++;
			} else if (ch[i] == 'D') {
				level--;
			}
			if (level == 0 && ch[i] == 'U') {
				valleyCount++;
			}
			/*
			 * if(level > maxLevel) { maxLevel = level; }
			 */
			/*
			 * if (level < 0) { belowSeaLevel = true; }
			 */

		}

		return valleyCount;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
        System.out.println(result);

        scanner.close();
    }

	/*
	INPUT 1: 
	
	12
	 
	DDUUDDUDUUUD

	OUTPUT 1 : 2
	
	_          /\_
	 \  /\    /              o/p: 2 
	  \/  \/\/
	  
	*/
	
    
}
