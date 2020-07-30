import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {

	// Problem Link: https://bit.ly/JumpingOnTheCloud

	/*
		Emma is playing a new mobile game that starts with consecutively numbered clouds. 
		Some of the clouds are thunderheads and others are cumulus. She can jump on any 
		cumulus cloud having a number that is equal to the number of the current cloud 
		plus  or . She must avoid the thunderheads. Determine the minimum number of jumps
		it will take Emma to jump from her starting postion to the last cloud. It is 
		always possible to win the game.

		For each game, Emma will get an array of clouds numbered 0 if they are safe or
		1 if they must be avoided.
				
	*/
	
	/*
	 *   INPUT:
	 *    
	 *   7
	 *	 0 0 1 0 0 1 0
	 * 
	 *   OUTPUT:
	 *   
	 *   4 
	 * 
	 * */	
	
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    	
    	int jumpCount = 0;
    	int currentIndex = 0;
    	
		for (int i = 0; i < c.length; i++) {
			if (currentIndex < c.length - 1) {
				if (c[currentIndex] == 1) {
					currentIndex += 2;
				} else if (c[currentIndex] == 0) {
					if (currentIndex + 2 < c.length && c[currentIndex + 2] == 0) {
						currentIndex += 2;
					} else {
						currentIndex++;
					}
				}
				//System.out.println("Ind: " + currentIndex);
				jumpCount++;
			}
		}

    	return jumpCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

        scanner.close();
    }
}
