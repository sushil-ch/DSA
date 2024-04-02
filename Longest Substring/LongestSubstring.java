
public class LongestSubstring{
    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(solution(s));
    }
    public static int solution(String s){

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int start = 0, end = 0; end < s.length(); end++){
            char currentChar = s.charAt(end);
            if(map.containsKey(currentChar)){
                start = map.get(currentChar) + 1;
            }
            map.put(currentChar, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}