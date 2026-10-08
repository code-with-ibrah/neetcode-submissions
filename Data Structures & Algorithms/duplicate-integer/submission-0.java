class Solution {
    public boolean hasDuplicate(int[] nums) {

        boolean duplicateExit = false;
        
        for(int i = 0; i < nums.length; i++){
            for(int k = i + 1; k < nums.length; k++){
                if(nums[i] == nums[k]){
                    duplicateExit = true;
                }
            }
        }

        return duplicateExit;
    }
}