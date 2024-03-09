package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID367ValidPerfectSquare{
	public static void main(String[] args) {
		Solution solution = new ID367ValidPerfectSquare().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试

		sb.append(solution.isPerfectSquare(5));
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPerfectSquare(int num) {
		boolean ans=false;

		int left=1;
		int right=num;

		while (left<=right)
		{
			int middle=left+(right-left)/2;
			if ((double)num/middle<middle)
				right=middle-1;
			else if ((double)num/middle>middle)
				left=middle+1;
			if((double)num/middle==middle) {
				ans=true;
				break;
			}

		}


		return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
