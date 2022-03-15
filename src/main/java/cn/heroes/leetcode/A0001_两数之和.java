package cn.heroes.leetcode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.*;

public class A0001_����֮�� {
//	����һ���������� nums�0�2��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���ǁ0�2�����0�2���������������ǵ������±ꡣ
//	����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ�������ͬһ��Ԫ�ز���ʹ�����顣
//	ʾ��:
//	���� nums = [2, 7, 11, 15], target = 9
//	��Ϊ nums[0] + nums[1] = 2 + 7 = 9
//	���Է��� [0, 1]
//	��Դ�����ۣ�LeetCode��
//	���ӣ�https://leetcode-cn.com/problems/two-sum
//	����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
	@Test
	public void testIt() {
		A0001_����֮�� a = new A0001_����֮��();
		assertArrayEquals(a.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
		assertArrayEquals(a.twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
	}
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			int num = nums[i];
			Integer index = map.get(num);
			if(index != null) {
				// Leon: ��������, ��װ�߲飬���ܿ�ͬ���������⡣
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
			// Leon: ��������
			if(index != null && index != i) {
				return new int[]{i, index};
			}
			
		}
		return null;
	}
	public int[] official(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
