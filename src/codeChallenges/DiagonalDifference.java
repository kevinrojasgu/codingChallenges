package codeChallenges;

import java.util.List;

public class DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
            int size = arr.size();
            int diagOne = 0;
            int diagTwo = 0;
            int result;
            for(int x = 0, y = size-1; x < size ; x ++, y-- ){
                diagOne += arr.get(x).get(x);
                diagTwo += arr.get(y).get(x);
            }
            result = diagOne - diagTwo;

            return (result >= 0) ? result : (result * -1);
        }

}
