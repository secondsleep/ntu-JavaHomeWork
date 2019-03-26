package ntuJHW;

public class C3_13 { // 求1!+2!+3!+...+15!，此处用了long类型正好能容纳结果（懒(～﹃～)~zZ。
	public static long getFactorial_rec(int a) { // 求阶乘，递归。!SECLETED!
		if (a < 1)
			return -1;
		if (a == 1)
			return 1;
		else
			return a * getFactorial_rec(a - 1);
	}

	public static long getFactorial_ite(int a) {	//求阶乘，迭代。
		if (a < 1)
			return -1;
		if (a == 1)
			return 1;
		int num = 1;
		for (int i = 1; i != a + 1; ++i)
			num *= i;
		return num;
	}

	public static void main(String[] args) {
		long num = 0;
		for (int i = 0; i != 15; ++i)
			num += getFactorial_rec(i + 1);
		System.out.printf("1!+2!+3!+...+15!的结果为：%d", num);
	}
}
