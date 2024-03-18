package leetcode.editor.cn;

import java.util.*;

import leetcode.editor.util.*;

public class ID844BackspaceStringCompare {
    public static void main(String[] args) {
        Solution solution = new ID844BackspaceStringCompare().new Solution();
        StringBuilder sb = new StringBuilder();

        //执行测试

        System.out.println(sb);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean backspaceCompare(String s, String t) {

            //双指针分别指向两个字符串的末尾
            //初始化两个变量skips和skipt，分别用于记录在遍历s和t时遇到的 '#' 字符数量。
            int skips = 0, skipt = 0;
            int i = s.length() - 1, j = t.length() - 1;

            //外层循环条件为i >= 0 || j >= 0，即只要两个字符串中任意一个还有未处理的字符就继续循环。
            while (i >= 0 || j >= 0) {

                //内层循环查找'#'字符并将skips递增，或者消耗已记录的skips，直到找到非#字符或到达字符串起始位置。
                while (i >= 0) {
                    if (s.charAt(i) == '#') {
                        skips++;
                        i--;
                    } else if (skips > 0) {
                        skips--;
                        i--;
                    } else {
                        break;
                    }
                }
                while (j >= 0) {
                    if (t.charAt(j) == '#') {
                        skipt++;
                        j--;
                    } else if (skipt > 0) {
                        skipt--;
                        j--;
                    } else {
                        break;
                    }
                }

                //比较当前未被跳过的字符是否相等，如果相等则继续循环，如果不相等则返回false。
                if (i >= 0 && j >= 0 ) {
                    if (s.charAt(i) != t.charAt(j)) {
                        return false;
                    }
                }
                else
                {
                    if (i >= 0 || j >= 0) {
                        return false;
                    }
                }
                i--;
                j--;
        }

		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
