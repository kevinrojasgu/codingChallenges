package codeChallenges;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class SolutionMissingInt {
    public int solution(int[] A) {
        Set<Integer> seta = new HashSet<Integer>();
        for(int i = 0 ; i < A.length ; i ++){
            if(A[i]>0){
                seta.add(Integer.valueOf(A[i]));
            }
        }
        if(seta.size() == 0) {
        	return 1;
        }
        
        Iterator<Integer> iter = seta.iterator();
        int i = 1;
        Integer aux ;
        while(iter.hasNext()){
        	aux = iter.next();
            if(aux.compareTo(Integer.valueOf(i))!=0){
                System.out.println("missing int: "+i);
                return i;
            }
            i++;
        }
        if(i>1) {
        	return i++;
        }
        return 1;
    }
    
	public int otherSolution(int A[]) {
	    int smallestMissingInteger = 1;
		if (A.length == 0) {
		    return smallestMissingInteger;
		}
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
		    if (A[i] > 0) {
		        set.add(A[i]);
		    }
		}
		while (set.contains(smallestMissingInteger)) {
		    smallestMissingInteger++;
		}

		return smallestMissingInteger;
	}
    

};
