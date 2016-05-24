package hackerrank;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dmitriyn on 2/22/16.
 */
public class StrEdu {
    public static void main(String[] args) {
        String A="anagram";
        String B="anagarm";
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }

    private static boolean isAnagram(String A, String B) {
        byte[] arrayA = A.toLowerCase().getBytes();
        byte[] arrayB = B.toLowerCase().getBytes();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        return Arrays.equals(arrayA, arrayB);

    }
}
