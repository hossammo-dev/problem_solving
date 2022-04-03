    //Problem Description//

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

class Solution {
    public int[] twoSum(int[] nums, int target) {
//         int arrayLength = nums.length;
//         int[] numbers = new int[2];
        
//                 for(int i = 0; i < arrayLength; i++){
//                     for(int j = i+1; j < arrayLength; j++){
//                         if(nums[i] +  nums[j] == target){
//                            numbers[0] = i;
//                            numbers[1] = j;
//                         }
//                 }
//         }
//         return numbers;
        
        //another solution
      
        //hashMaps are more effecient than arrays to store data and is prefect for storing double values: [key, value].  
        Map<Integer, Integer> previousNumbers = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int currentKey = target - nums[i];
            if(previousNumbers.containsKey(currentKey)){
                return new int[]{previousNumbers.get(currentKey), i};
            }else{
                previousNumbers.put(nums[i], i);
            }
        }
        return new int[]{0, 0};
    }
}
