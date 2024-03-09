package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID1TwoSum {
    public static void main(String[] args) {
        Solution solution = new ID1TwoSum().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
        int test[] = {2, 7, 11, 15};
        sb.append(solution.twoSum(test, 9));

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
/*
		//暴力搜索 O(n2)
		int ans[]=new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]+nums[j]==target)
				{
					ans[0]=i;
					ans[1]=j;
				}
			}
		}

		return ans;
*/

            //hashmap
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i]))
                    return new int[]{map.get(target - nums[i]),i };
                map.put(nums[i], i);
            }


            return new int[0];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
