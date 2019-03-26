package ntuJHW;

public class C3_14 { // 用do-while和for循环计算1+1/2!+1/3!+1/4!+...的前15项和
	public static double getMinFactorial_rec(int a) {
		if (a <= 0)
			return -1;
		if (a == 1)
			return 1;
		return (1 / (double) a) * getMinFactorial_rec(a - 1);
	}

	public static void main(String args[]) {
		int i = 0;
		double num = 0;
		do {
			num += getMinFactorial_rec(i++ + 1);
		} while (i != 15);
		System.out.println("do-white循环计算1+1/2!+1/3!+1/4!+...前15项和的结果为：" + num);
		num = 0.0;
		for (i = 0; i != 15; ++i)
			num += getMinFactorial_rec(i + 1);
		System.out.println("for循环计算1+1/2!+1/3!+1/4!+...前15项和的结果为：" + num);
	}

}
