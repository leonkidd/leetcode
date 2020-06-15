package cn.heroes.leetcode;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import static org.junit.Assert.assertEquals;

public class A0003_���ظ��ַ�����Ӵ� {
//	����һ���ַ����������ҳ����в������ظ��ַ��ā0�2��Ӵ��0�2�ĳ��ȡ�
//
//	ʾ���0�21:
//
//	����: "abcabcbb"
//	���: 3
//	����: ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3��
//	ʾ�� 2:
//
//	����: "bbbbb"
//	���: 1
//	����: ��Ϊ���ظ��ַ�����Ӵ��� "b"�������䳤��Ϊ 1��
//	ʾ�� 3:
//
//	����: "pwwkew"
//	���: 3
//	����: ��Ϊ���ظ��ַ�����Ӵ��ǁ0�2"wke"�������䳤��Ϊ 3��
//			�0�2    ��ע�⣬��Ĵ𰸱����� �Ӵ� �ĳ��ȣ�"pwke"�0�2��һ�������У������Ӵ���
//
//	��Դ�����ۣ�LeetCode��
//	���ӣ�https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
//	����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
	
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
		A0003_���ظ��ַ�����Ӵ� a = new A0003_���ظ��ַ�����Ӵ�();
		
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
