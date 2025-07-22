import java.util.Map;
import java.util.HashMap;
//Longest Substring with Unique Elements!!!
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        int st = 0;
        int dr = 0;
        int len = 0;
        int ma = -1;

        Map<Character, Integer> map = new HashMap<>();

        int n = s.length();

        while(dr < n){
            len++;

            if(map.containsKey(s.charAt(dr))){
                map.put(s.charAt(dr), map.get(s.charAt(dr)) + 1);
            }
            else{
                map.put(s.charAt(dr), 1);
            }

            while(map.get(s.charAt(dr)) > 1){
                len--;
                map.put(s.charAt(st), map.get(s.charAt(st)) -1);
                if(map.get(s.charAt(st)) == 0){
                    map.remove(s.charAt(st));
                }
                st++;
            }
            ma = Math.max(ma, len);
            dr++;
        }
        return ma;
    }
}