package ntuJHW;

import java.util.ArrayList;
import java.util.List;

public class C3_17 { // 求1000以内的完数（一个数自身等于它的因子之和）
	public static List<Integer> getPerfectNum(int min, int max) {
		List<Integer> perfectNum = new ArrayList<>();
		for (int i = min; i < max; ++i) {
			int sum = 0;
			for (int j = 1; j < i / 2 + 1; ++j)
				if (i % j == 0) {
					sum += j;
				}
			if (sum == i)
				perfectNum.add(i);
		}
		return perfectNum;
	}

	public static void main(String args[]) {
		List<Integer> perfectNum = getPerfectNum(2,1000);
		System.out.print("1000以内的完数有：");
		for (int i = 0; i != perfectNum.size(); ++i) {
			int num = perfectNum.get(i);
			System.out.printf(" %d ", num);
		}
	}
}
