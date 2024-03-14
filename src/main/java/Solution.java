public class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal == 0){
            int count = 0;
            int curCount = 0;
            for (int i = 0; i < nums.length + 1; i++) {
                if( i < nums.length && nums[i] == 0){
                    curCount++;
                }else if(i == nums.length || nums[i] == 1){
                    count += (1 + curCount) * curCount / 2;
                    curCount = 0;
                }
            }
            return count;

        }
        int left = 0;
        int count = 0;
        int l0 = 0;
        int r0 = 0;
        int sum = 0;
        for (int right = 0; right < nums.length + 1; right++) {
            if(right < nums.length){
                sum += nums[right];
            }

            if((right == nums.length && sum == goal) || (right < nums.length && (sum > goal))){
                count += l0 + 1 + r0 + l0 * r0;

                r0 = 0;
                l0 = 0;
                while ( sum > goal && left < right){
                    sum -= nums[left++];
                }
                while (left < nums.length && nums[left] == 0 ){
                    l0++;
                    left++;
                }


            }  else if (right < nums.length && sum == goal && nums[right] == 0) {
                r0++;
            } else if (right < nums.length && sum == 0) {
                l0++;
            }
        }

        return count;
    }
}
