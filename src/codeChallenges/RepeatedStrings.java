package codeChallenges;


import java.io.*;
import java.util.*;

public class RepeatedStrings {

	 // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int size = s.length();
        long exactRepeats = ( n / size);
        int missingStartIndex = size - (int)(n % size) ;
        
        System.out.println("size: "+size);
        System.out.println("exactRepeats : "+exactRepeats);
        System.out.println("missingStartIndex : "+ missingStartIndex);
        
        long missingOccurs = 0L;
        if(n % size > 0){
            missingOccurs = countChars(s.substring(0, size - missingStartIndex));
        }
        
        System.out.println("missingOccurs "+missingOccurs);
        
        return (countChars(s) * exactRepeats) + missingOccurs;  
    }

    static int countChars(String s){
        int count = 0;

        for(int i = 0; i < s.length() ; i++ ){
            if(s.charAt(i) == 'a'){ 
                count ++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    //	System.out.println(repeatedString("bcbccacaacbbacabcabccacbccbababbbbabcccbbcbcaccababccbcbcaabbbaabbcaabbbbbbabcbcbbcaccbccaabacbbacbc", 649606239668L));
    }
}
