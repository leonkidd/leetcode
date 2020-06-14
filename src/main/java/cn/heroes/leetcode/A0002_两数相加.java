package cn.heroes.leetcode;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class A0002_两数相加 {
//	给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//
//	如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
//	您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//	示例：
//
//	输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//	输出：7 -> 0 -> 8
//	原因：342 + 465 = 807
//
//	来源：力扣（LeetCode）
//	链接：https://leetcode-cn.com/problems/add-two-numbers
//	著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	
	public class ListNode {
		int val;
		ListNode next;
		
		ListNode(int x) {
			val = x;
		}
	}
	
	@Test
	public void testIt() {
		A0002_两数相加 a = new A0002_两数相加();
		
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
				// 两项都结束
				break;
			}
		}
		return r;
	}
}
