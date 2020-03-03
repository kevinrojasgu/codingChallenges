package codeChallenges;

public class RiddleWord {

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		System.out.println("result ?: "+s.solution("?"));
		
		System.out.println("result ??: "+s.solution("??"));
		
		System.out.println("result : "+s.solution(""));
		
		System.out.println("result a?a: "+s.solution("a?a"));
		
		System.out.println("result ???????: "+s.solution("???????"));
		
		System.out.println("result as?asdew?asd?: "+s.solution("as?asdew?asd?"));
		
		System.out.println("result as?asdew???: "+s.solution("as?asdew???"));
		
		System.out.println("result ?asdew?asd: "+s.solution("?asdew?asd"));
		
	}
}

class Solution{
	final char[] ABC = "abc".toCharArray();
	
	public String solution(String word) {
		char questMark = '?';
		int lenght = word.length();
		char[] wordInChars = word.toCharArray();
		if(!word.isBlank() ||  word.contains("?"))  {
			
			for(int i = 0; i < lenght; i++) {
				
				if(wordInChars[i] == questMark) {
					char prev = '\0';
					char next = '\0';
					if(i == 0) {
						next = lenght > 1 ? wordInChars[1] : next;
					}
					else if(i == lenght-1) {
						prev = lenght > 1 ? wordInChars[i-1] : prev;
					}else {
						if(lenght > 2) {
							prev = wordInChars[i - 1];
							next = wordInChars[i + 1];
						}
					}

					wordInChars[i] = replaceChar(prev, next);
				}
			}
		}else {
			return word;
		}
			
		return String.copyValueOf(wordInChars);
	}
	
	private char replaceChar(char prev, char next) {
		char result = '\0';
			for(char c : ABC) {
				if(c != prev && c != next) {
					return c;
				}
			}
		return result;
	}
}