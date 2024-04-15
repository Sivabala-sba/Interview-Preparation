package DSA.ArraysHashing;

import java.util.Arrays;

//242. Valid Anagram
public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        char[] sword = s.toCharArray();
        char[] tword = t.toCharArray();

        Arrays.sort(sword);
        Arrays.sort(tword);

        return Arrays.equals(sword, tword);
    }
}
