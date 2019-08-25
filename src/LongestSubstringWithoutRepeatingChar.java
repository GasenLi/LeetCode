import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        HashSet<Character> setTemp = new HashSet<>();
        int longestLen = 0;

        for(int i=0 ;i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(setTemp.contains(chars[j])){
                    break;
                }else {
                    setTemp.add(chars[j]);
                }
            }

            longestLen = Math.max(longestLen, setTemp.size());
            setTemp.clear();
        }

        return longestLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }
}
