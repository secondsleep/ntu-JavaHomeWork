package ntuJHW;

public class C3_6 { // 打印九九乘法表
	public static void outMulTable_ite(int a) { // 迭代输出乘法表内容。!SELETED!
		System.out.print("* |");
		for (int i = 0; i != a; ++i)
			System.out.printf("  %d", i + 1);
		System.out.println();
		System.out.print("- |");
		for (int i = 0; i != a; ++i)
			System.out.print("---");
		System.out.println();
		for (int i = 0; i != a; ++i) {
			System.out.printf("%d |", i + 1);
			for (int j = 0; j != i + 1; ++j)
				System.out.printf("  %d", (i + 1) * (j + 1));
			System.out.println();
		}
		return;
	}

	public static void outMulTable_miaomiaomiao() { // 智熄法输出九九乘法表内容。
		System.out.println("* |  1  2  3  4  5  6  7  8  9");
		System.out.println("- |---------------------------");
		System.out.println("1 |  1");
		System.out.println("2 |  2  4");
		System.out.println("3 |  3  6  9");
		System.out.println("4 |  4  8  12  16");
		System.out.println("5 |  5  10  15  20  25");
		System.out.println("6 |  6  12  18  24  30  36");
		System.out.println("7 |  7  14  21  28  35  42  49");
		System.out.println("8 |  8  16  24  32  40  48  56  64");
		System.out.println("9 |  9  18  27  36  45  54  63  72  81");
		return;
	}

	public static void main(String[] args) {
		outMulTable_ite(9);
	}
}
