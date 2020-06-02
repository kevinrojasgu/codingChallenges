package codeChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

	 static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	        int aScore = 0;
	        int bScore = 0;
	        for(int i = 0; i<a.size(); i++){
	            if(a.get(i)>b.get(i)){
	                aScore ++;
	            }else if(a.get(i)<b.get(i)){
	                bScore++;
	            }
	        }
	        
	        
	        
	        return new ArrayList<Integer>(Arrays.asList(aScore,bScore));
	    }
}
