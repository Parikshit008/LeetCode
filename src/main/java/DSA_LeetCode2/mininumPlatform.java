package DSA_LeetCode2;


import java.util.Arrays;

import org.testng.annotations.Test;

public class mininumPlatform {

	public int minPlatform(int[] arr, int[] dep) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i = 0, j = 0, platform = 0, ans = 0;
		while (i < arr.length && j < dep.length) {
			if (arr[i] <= dep[j]) {

				platform++;
				i++;
			} else {
				platform--;
				j++;
			}
			ans = Math.max(platform, ans);
		}
		return ans;

	}

	@Test
	public void testA() {
		int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
		int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };
		int minPlatform = minPlatform(arr, dep);
		System.out.println(minPlatform);
	}

	@Test
	public void testB() {
		int[] arr = { 900, 1235, 1100 };
		int[] dep = { 1000, 1240, 1200 };
		int minPlatform = minPlatform(arr, dep);
		System.out.println(minPlatform);
	}

	@Test
	public void testC() {
		int[] arr = { 1000, 935, 1100 };
		int[] dep = { 1200, 1240, 1130 };
		int minPlatform = minPlatform(arr, dep);
		System.out.println(minPlatform);
	}

}