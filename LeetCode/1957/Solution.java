class Solution {
    public String makeFancyString(String s) {
        int nr = 1;
        int i;
        String temp = new String();
        for(i = 0; i < s.length()-1; ++i){
            if(s.charAt(i) == s.charAt(i+1)){
                ++nr;
            }
            else {
                if(nr >= 2) {
                    temp += s.substring(i-1,i+1);
                }
                else
                    temp += s.substring(i,i+1);
                nr = 1;
            }
        }
        if(nr >= 2) {
            temp += s.substring(i-1,i+1);
        }
        else
            temp += s.substring(i,i+1);
        return temp;
    }
}