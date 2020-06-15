package cn.heroes.leetcode;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import static org.junit.Assert.assertEquals;

public class A0003_无重复字符的最长子串 {
//	给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
//	示例 1:
//
//	输入: "abcabcbb"
//	输出: 3
//	解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
//	示例 2:
//
//	输入: "bbbbb"
//	输出: 1
//	解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
//	示例 3:
//
//	输入: "pwwkew"
//	输出: 3
//	解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//			     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
//
//	来源：力扣（LeetCode）
//	链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
//	著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	
	public static void main(String[] args) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		String s = "abcdbcbb";
		char[] cs = s.toCharArray();
		for(char c : cs) {
			set.add(c);
		}
		System.out.println(set);
	}
	
	@Test
	public void testIt() {
		A0003_无重复字符的最长子串 a = new A0003_无重复字符的最长子串();
		
		assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, lengthOfLongestSubstring("pwwkew"));
	}
	
	public int lengthOfLongestSubstring(String s) {
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		char[] cs = s.toCharArray();
		
		return 0;
	}
}
