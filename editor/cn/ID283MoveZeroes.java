package leetcode.editor.cn;

import java.util.Arrays;

public class ID283MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new ID283MoveZeroes().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试
       /* int nums[] = {0};
        sb.append(Arrays.toString(solution.moveZeroes(nums)));
        System.out.println(sb);
        */
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int leftIndex = 0; // 左指针，指向当前需要填入非零数的位置
            for (int rightIndex = 0; rightIndex < nums.length; rightIndex++) {
                // 如果右指针指向非零数
                if (nums[rightIndex] != 0) {
                    // 如果左指针和右指针不重合，则交换它们指向的元素
                    if (leftIndex != rightIndex) {
                        swap(nums, leftIndex, rightIndex);
                    }
                    // 左指针向右移动，准备填入下一个非零数
                    leftIndex++;
                }
            }
        }

//            return nums;


        //交换数组索引对应的元素值
        public void swap(int[] nums, int leftIndex, int rightIndex) {
            int temp = nums[leftIndex];
            nums[leftIndex] = nums[rightIndex];
            nums[rightIndex] = temp;
        }

    }


//leetcode submit region end(Prohibit modification and deletion)

}


