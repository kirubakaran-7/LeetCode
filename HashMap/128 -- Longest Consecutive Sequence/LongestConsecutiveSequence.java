import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutiveSequence {
     public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],i);
        }

        Integer[] d = map.keySet().toArray(new Integer[0]);
        Arrays.sort(d);
        int sum = 1;
        int longest = 1;
        int h = d.length;

        for(int i = 1 ; i < h ; i++){
            if(d[i] == d[i-1]+1){
                sum++;
                longest = Math.max(longest,sum);
            }
            else{
                sum = 1;
            }
        }

        return longest;
    }
}
