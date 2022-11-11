import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] returnArray = new int[2];
        Map<Integer, Integer> searchedMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(searchedMap.containsKey(target - nums[i])) {
                returnArray[0] = searchedMap.get(target - nums[i]);
                returnArray[1] = i;
                return returnArray;
            }
            searchedMap.put(nums[i], i);
        }

        return returnArray;
    }
}
