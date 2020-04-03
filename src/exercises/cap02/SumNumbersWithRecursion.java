package exercises.cap02;

import java.util.Arrays;
import java.util.List;

public class SumNumbersWithRecursion {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3,40,-9);

		int result = sum(list, list.size());
		System.out.println("result: " + result);
	}

	private static int sum(List<Integer> list, int index) {
		if (index <= 0) {
			return 0;
		}
		return sum(list, index - 1) + list.get(index - 1);
	}

}
