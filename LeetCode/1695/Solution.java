import java.util.Map;
import java.util.HashMap;


class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       int st = 0, dr = 0, s = 0, ma = -1;

       Map<Integer, Integer> map = new HashMap<>();

       int n = nums.length;

       while(dr < n){
           s+= nums[dr];
//           for(int i=st; i<=dr;++i) {
//               System.out.print(nums[i]);
//
//           }
//           System.out.print("\n");
           if (map.containsKey(nums[dr])) {
               map.put(nums[dr], map.get(nums[dr]) + 1);
           } else {
               map.put(nums[dr], 1);
           }
           while (map.get(nums[dr]) > 1) {
               s -= nums[st];
               map.put(nums[st], map.get(nums[st]) - 1);  //all distinct subarrays
               if (map.get(nums[st]) == 0) {
                   map.remove(nums[st]);
               }
               st++;
           }
           ma = Math.max(ma, s);
           dr++;
       }
        return ma;
    }

}