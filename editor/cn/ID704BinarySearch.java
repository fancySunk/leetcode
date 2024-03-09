package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID704BinarySearch {
    public static void main(String[] args) {
        Solution solution = new ID704BinarySearch().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
        int nums[]={-1,0,3,5,9,12};
        int target=13;
        sb.append(solution.search(nums,target));
        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length-1;
            int middle = 0;
            while (left <= right) {
                middle = left +( right-left) / 2;
                //在右侧
                if (target > nums[middle])
                    left = middle + 1;
                //在左侧
                else if (target < nums[middle])
                    right = middle - 1;
                //target==nums[middle]
                else return middle;

            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
