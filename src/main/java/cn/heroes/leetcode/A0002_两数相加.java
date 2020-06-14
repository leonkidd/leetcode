package cn.heroes.leetcode;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class A0002_������� {
//	���������0�2�ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��Ձ0�2����0�2�ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢�0�2һλ�0�2���֡�
//
//	��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
//
//	�����Լ���������� 0 ֮�⣬���������������� 0�0�2��ͷ��
//
//	ʾ����
//
//	���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
//	�����7 -> 0 -> 8
//	ԭ��342 + 465 = 807
//
//	��Դ�����ۣ�LeetCode��
//	���ӣ�https://leetcode-cn.com/problems/add-two-numbers
//	����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
	
	public class ListNode {
		int val;
		ListNode next;
		
		ListNode(int x) {
			val = x;
		}
	}
	
	@Test
	public void testIt() {
		A0002_������� a = new A0002_�������();
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode r = a.addTwoNumbers(l1, l2);
		
		assertEquals(7, r.val);
		assertEquals(0, r.next.val);
		assertEquals(8, r.next.next.val);
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode r = null;
		ListNode t = null;
		
		boolean isFirst = true;
		boolean up = false;
		int h = 0;
		while (true) {
			int val1 = 0;
			int val2 = 0;
			if (l1 != null) {
				val1 = l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				val2 = l2.val;
				l2 = l2.next;
			}
			
			if(up) {
				h = val1 + val2 + 1;
				up = false;
			} else {
				h = val1 + val2;
			}
			
			if(h >= 10) {
				up = true;
				h -= 10;
			}
			
			if (isFirst) {
				r = new ListNode(h);
				t = r;
				isFirst = false;
			} else {
				t.next = new ListNode(h);
				t = t.next;
			}
			
			if (l1 == null && l2 == null && !up) {
				// �������
				break;
			}
		}
		return r;
	}
}
