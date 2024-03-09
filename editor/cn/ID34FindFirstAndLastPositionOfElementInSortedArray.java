package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID34FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {

        long start=System.currentTimeMillis();
        Solution solution = new ID34FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
        int nums[]={5,7,7,8,8,10};
        int target=6;

        sb= new StringBuilder(Arrays.toString(solution.searchRange(nums, target)));
        System.out.println(sb);
        long end =System.currentTimeMillis();

        System.out.println(end-start);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int leftBoarder = getLeftBoarder(nums, target);
            int rightBoarder = getRightBoarder(nums, target);

            //不存在目标值
            if (rightBoarder == -2 || leftBoarder == -2)
                return new int[]{-1, -1};
            else if (rightBoarder - leftBoarder > 1)
                return new int[]{leftBoarder+1, rightBoarder-1};

            else return new int[]{-1, -1};
        }

        //返回左边界
        int getLeftBoarder(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int leftBoarder = -2;

            while (left <= right) {
                int middle = left + (right - left) / 2;

                //寻找左边界，就要在nums[middle] == target的时候更新right
                if (nums[middle] >= target) {
                    right = middle - 1;
                    leftBoarder = right;
                } else left = middle + 1;
            }
            return leftBoarder;
        }

        //返回右边界
        int getRightBoarder(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int rightBoarder = -2;

            while (left <= right) {
                int middle = left + (right - left) / 2;

                if (nums[middle] > target) {
                    right = middle - 1;

                }
                //寻找右边界，就要在nums[middle] == target的时候更新right
                else {
                    left = middle + 1;
                    rightBoarder = left;
                }
            }
            return rightBoarder;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
