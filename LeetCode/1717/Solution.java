class Solution {
    public int maximumGain(String s, int x, int y) {
        int score = 0;

        if(x > y){
            int n = s.length();
            StringBuilder sir = new StringBuilder();
            for(int i = 0; i<n; ++i){
                sir.append(s.charAt(i));
                int len = sir.length();
                if(len >= 2 && sir.substring(len-2).equals("ab")){
                    sir.delete(len - 2, len);
                    score += x;
                }
            }

            n = sir.length();
            StringBuilder sir1 = new StringBuilder();
            for(int i = 0; i<n; ++i){
                sir1.append(sir.charAt(i));
                int len = sir1.length();
                if(len >=2 && sir1.substring(len-2).equals("ba")){
                    sir1.delete(len -2, len);
                    score +=y;
                }
            }

        }
        else{
            int n = s.length();
            StringBuilder sir = new StringBuilder();
            for(int i = 0; i<n; ++i){
                sir.append(s.charAt(i));
                int len = sir.length();
                if(len >= 2 && sir.substring(len-2).equals("ba")){
                    sir.delete(len - 2, len);
                    score += y;
                }
            }

            n = sir.length();
            StringBuilder sir1 = new StringBuilder();
            for(int i = 0; i<n; ++i){
                sir1.append(sir.charAt(i));
                int len = sir1.length();
                if(len >=2 && sir1.substring(len-2).equals("ab")){
                    sir1.delete(len -2, len);
                    score +=x;
                }
            }
        }
        return score;
    }
}