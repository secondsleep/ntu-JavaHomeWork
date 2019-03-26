package ntuJHW;

import java.util.Scanner;

public class C3_5 { //求两个整数的最大公约数 PS.只考虑了在INT类型范围内的整数
	public static int gcdEuclidean_rec(int a, int b) { // 欧几里得算法，递归形式。 !SELECTED!
		if (b == 0)
			return a;
		return gcdEuclidean_rec(b, a % b);
	}

	public static int gecEulidean_ite(int a, int b) { // 欧几里得算法，迭代形式。
		while (b != 0) {
			int r = b;
			b = a % b;
			a = r;
		}
		return a;
	}

	public static void main(String args[]) {
		System.out.print("输入两个整数（两个整数中间以空格分隔）：");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		in.close();
		int result = gcdEuclidean_rec(num1, num2);
		System.out.printf("它们的最大公约数为：%d", result);
	}
}
