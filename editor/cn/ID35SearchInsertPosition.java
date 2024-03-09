package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

/*二分查找类型题
也可以暴力搜索*/

public class ID35SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new ID35SearchInsertPosition().new Solution();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        //执行测试
        int nums[]={1,3,5,6};
        int target1=2;
        int target2=0;
        sb1.append(solution.searchInsert(nums,target1));
        sb2.append(solution.searchInsert(nums,target2));

        System.out.println(sb1);
        System.out.println(sb2);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int middle = 0;
            while (left <= right) {
                middle = left + (right - left) / 2;
                if (nums[middle] < target)
                    left = middle + 1;
                else if (nums[middle] > target)
                    right = middle - 1;
                else return middle;
            }

            //左闭右闭的区间，所以插入位置应该为right+1,如果是左闭右开的区间的话返回right即可
            return right+1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
