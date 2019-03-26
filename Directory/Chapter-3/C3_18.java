package ntuJHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C3_18 { // 从键盘读取若干个数，空格分隔，以"-1"结束，从小到大排序

	public static void main(String args[]) {
		System.out.print("输入若干数，以 -1 结束：");
		Scanner in = new Scanner(System.in);
		List<Integer> myList = new ArrayList<>();
		int i = 0;
		do {
			int num = in.nextInt();
			if (num == -1) {
				in.close();
				break;
			} else if (i == 0)
				myList.add(num);
			else if (myList.get(i - 1) < num)
				myList.add(num);
			else {
				for (int j = 0; j != i; ++j)
					if (myList.get(j) > num) {
						myList.add(j, num);
						break;
					}
			}
			++i;
		} while (true);
		System.out.println("排序后：");
		for (i = 0; i != myList.size(); ++i) {
			int num = myList.get(i);
			System.out.printf(" %d ", num);
		}
	}
}
