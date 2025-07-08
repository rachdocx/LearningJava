class Solution {
    public boolean isPalindrome(int x) {
        int pal = 0;
        int aux = x;
        while(x > 0){
            pal = pal*10 + x%10;
            x = x / 10;
        }
        if(aux == pal)
            return true;
        return false;

    }
}