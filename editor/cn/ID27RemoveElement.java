package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID27RemoveElement{
	public static void main(String[] args) {
		Solution solution = new ID27RemoveElement().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {

		//定义慢指针用来存储新数组的元素
		int slowIndex=0;
		//定义一个快指针先判断是否与目标值相等，如果不等于目标值就相当于指向的元素是新数组需要的元素
		for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
			if (nums[fastIndex]!=val)
			{
				nums[slowIndex]=nums[fastIndex];

				//判断是新数组中所需要的元素则慢指针也同步后移
				slowIndex++;

			}
		}
		return slowIndex;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
