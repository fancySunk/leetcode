package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID26RemoveDuplicatesFromSortedArray{
	public static void main(String[] args) {
		Solution solution = new ID26RemoveDuplicatesFromSortedArray().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {

		//定义慢指针指向第一个元素，快指针则初始指向第二个元素
		int slowIndex=0;
		for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
			if (nums[fastIndex]!=nums[slowIndex])
			{
				nums[slowIndex+1]=nums[fastIndex];
				slowIndex++;
			}

		}
		return slowIndex+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
