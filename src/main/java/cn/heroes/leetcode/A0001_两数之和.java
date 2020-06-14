package cn.heroes.leetcode;

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

public class A0001_两数之和 {
//	给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//	你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//	示例:
//	给定 nums = [2, 7, 11, 15], target = 9
//	因为 nums[0] + nums[1] = 2 + 7 = 9
//	所以返回 [0, 1]
//	来源：力扣（LeetCode）
//	链接：https://leetcode-cn.com/problems/two-sum
//	著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
	@Test
	public void testIt() {
		A0001_两数之和 a = new A0001_两数之和();
		assertArrayEquals(a.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
		assertArrayEquals(a.twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
	}
	
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			int num = nums[i];
			Integer index = map.get(num);
			if(index != null) {
				if(num + num == target) {
					return new int[]{index, i};
				}
			} else {
				map.put(num, i);
			}
			
		}
		
		for(int i = 0; i < nums.length; i++) {
			int num = nums[i];
			Integer index = map.get(target - num);
			if(index != null && index != i) {
				return new int[]{i, index};
			}
			
		}
		return null;
	}
}
