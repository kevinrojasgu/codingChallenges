package codeChallenges;

class BinaryGap{
	public int solution(int N) {
		
		if( N == 0 || N < 4) {
			return 0;
		}
		
		String binary = Integer.toBinaryString(N);
		char[] chars = binary.toCharArray();
		int gap = 0;
		int charsL = chars.length;
		int biggestGap = 0;
		for(int i = 0 ; i < charsL ; i++ ) {
			if(chars[i] == '1') {
				for(int j = 1; j < charsL ; j++) {
					if( chars[j] == '0' ) {
						gap++;
					}else {
						i = j;
						if( gap > biggestGap) {
							biggestGap = gap;
						} 
						gap = 0;
					}
				}
			}
		}
		return biggestGap;
		
	}
}




