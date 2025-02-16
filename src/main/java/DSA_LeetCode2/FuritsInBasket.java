package DSA_LeetCode2;

import java.util.HashMap;

public class FuritsInBasket {

	public static void main(String[] args) {

		int[] fruits = {1,2,3,2,2};
		System.out.println(totalFruit(fruits));

	}

	public static int totalFruit(int[] fruits) {
		HashMap<Integer, Integer> basket = new HashMap<>();
		int left = 0, right = 0, maxFruits = 0;

		for (right = 0; right < fruits.length; right++) {
			// add current fruit to basket- new/unique ones
			int currCount = basket.getOrDefault(fruits[right], 0);
			basket.put(fruits[right],  currCount+ 1);

			while (basket.size() > 2) {

				int prevFruitCount = basket.get(fruits[left]);
				if (prevFruitCount == 1) {
					basket.remove(fruits[left]);
				} else {
					basket.put(fruits[left], prevFruitCount - 1);
					//left++;

				}
				left++;
				
			}
			maxFruits = Math.max(maxFruits, right - left + 1);

		}

		return maxFruits;

	}

}
