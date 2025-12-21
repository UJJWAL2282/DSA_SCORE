/* 229. Majority Element II
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2] 
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_ElementII {
    

     public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> set=new HashMap<>();


        for(int i=0; i<n; i++){
            set.put(nums[i],set.getOrDefault(nums[i],0)+1);
        }

        for(int num:set.keySet()){
            if(set.get(num)>n/3){
                ans.add(num);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        Majority_ElementII sol=new Majority_ElementII();
        int[] nums={3,2,3};
        List<Integer> result=sol.majorityElement(nums);
        System.out.println(result);
    }
}
