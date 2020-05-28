package codeChallenges;

	import java.util.*;

	public class RansomNote {

	    // Complete the checkMagazine function below.
	    static void checkMagazine(String[] magazine, String[] note) {
	        boolean flag = false;

	        if(note.length <= magazine.length){
	            HashMap<String, Integer> magazineHash = convertToHash(magazine);
	            HashMap<String, Integer> noteHash = convertToHash(note);
	            for (Map.Entry<String, Integer> entry : noteHash.entrySet())    {
	            	if(magazineHash.containsKey(entry.getKey()) &&
	                    magazineHash.get(entry.getKey()) >= entry.getValue())
	            	{
	                    flag = true;                    
	                }else{
	                    flag = false;
	                    break;
	                }
	            }
	        }else{
	            flag = false;
	        }   
	        System.out.println(flag ? "Yes" : "No");


	    }

	    static HashMap<String, Integer> convertToHash(String[] s){
	        HashMap<String, Integer> result = new HashMap<String, Integer>();
	        for(int i = 0 ; i < s.length ; i++){
	            if(result.containsKey(s[i])){
	            	result.put(s[i], result.get(s[i]) + 1);
	            }else{
	                result.put(s[i], Integer.valueOf(1));
	            }
	        }
	        return result;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        String[] mn = scanner.nextLine().split(" ");

	        int m = Integer.parseInt(mn[0]);

	        int n = Integer.parseInt(mn[1]);

	        String[] magazine = new String[m];

	        String[] magazineItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < m; i++) {
	            String magazineItem = magazineItems[i];
	            magazine[i] = magazineItem;
	        }

	        String[] note = new String[n];

	        String[] noteItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            String noteItem = noteItems[i];
	            note[i] = noteItem;
	        }

	        checkMagazine(magazine, note);

	        scanner.close();
	    }
	
}
