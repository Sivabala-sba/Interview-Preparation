package DSA.ArraysHashing;

import java.util.Arrays;

//217. Contains Duplicate
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        int num = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<=num; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
