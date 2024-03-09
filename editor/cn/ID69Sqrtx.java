package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID69Sqrtx{
	public static void main(String[] args) {
		Solution solution = new ID69Sqrtx().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试

		sb=sb.append(solution.mySqrt(4));
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int mySqrt(int x) {
		int left=1;
		int right=x;


		while (left<=right)
		{
			int middle=left+(right-left)/2;

			//防止溢出
			if (x/middle<middle)
				right=middle-1;
			else
				left=middle+1;
		}

		return left-1;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
