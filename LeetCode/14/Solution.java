public class Solution {
    public String longestCommonPrefix(String[] strs) {
        for (String s : strs) {
            if (s.length() == 0) return "";
        }

        for(int i = strs[0].length(); i>=1; i-- ){
            String prefix = strs[0].substring(0,i);
            boolean flag = true;
            for(int j=1; j<strs.length; j++){
                if(i > strs[j].length()){
                    flag = false;
                    break;
                }
                String prefix1 = strs[j].substring(0,i);
                if(!prefix1.equals(prefix)){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return prefix;
            }
        }
        return "";
    }
}