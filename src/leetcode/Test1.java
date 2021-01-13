package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 求两个数之和
 */

public class Test1 {
    /**
     * 暴力法 o(n^2)
     */
    /*public static int[] twoSum(int[] nums,int target){
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }*/

    /**
     * 一遍Hash
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    /**
     * 字符串中第一个唯一字符
     * @param s
     * @return
     */
    public static int firstUniqChar(String s){
        HashMap<Character,Integer> count = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(int i = 0;i<s.length();i++){
            if(count.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ints1 = {1, 21,1,2,3,6};
        int[] ints = twoSum(ints1, 24);
        System.out.println(ints[0]+"===="+ints[1]);
        System.out.println(firstUniqChar("hello world"));
    }
}
