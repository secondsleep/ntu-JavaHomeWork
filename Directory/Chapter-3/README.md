# 第三章

## [5题](C3_5.java)

```java
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
```

## [6题](C3_6.java)

```java
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
```

## [9题](C3_9.java)

```java
package ntuJHW;

import java.util.Arrays;

public class C3_9 { // 对A[]={30,1,-9,70,25}数组由小到大排序
	// 使用Arrays类自带的sort排序。!SELETED!
	public static void qSort(int[] arr, int head, int tail) { // 快速排序
		if (head >= tail || arr == null || arr.length <= 1) {
			return;
		}
		int i = head, j = tail, pivot = arr[(head + tail) / 2];
		while (i <= j) {
			while (arr[i] < pivot) {
				++i;
			}
			while (arr[j] > pivot) {
				--j;
			}
			if (i < j) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				++i;
				--j;
			} else if (i == j) {
				++i;
			}
		}
		qSort(arr, head, j);
		qSort(arr, i, tail);
	}

	public static void main(String args[]) {
		int A[] = { 30, 1, -9, 70, 25 };
		System.out.print("排序前：A[] = {");
		for (int i = 0; i != A.length; ++i)
			System.out.printf(" %d ", A[i]);
		System.out.println("}");
		Arrays.sort(A);  // 使用快速排序则将这句改为 qSort(A,0,A.length-1);
		System.out.print("排序后：A[] = {");
		for (int i = 0; i != A.length; ++i)
			System.out.printf(" %d ", A[i]);
		System.out.println("}");
	}
}
```

## [11题](C3_11.java)

```java
package ntuJHW;

import java.util.ArrayList;
import java.util.List;

public class C3_11 { // 求2~1000以内的所有素数，并按每行5列的格式输出
	public static boolean isPrime(int num) {
		if (num < 1)
			return false;
		for (int i = 2; i < num / 2; ++i)
			if (num % i == 0)
				return false;
		return true;
	}

	public static List<Integer> getPrime(int min, int max) {
		List<Integer> PrimeList = new ArrayList<>();
		for (int i = min; i != max + 1; ++i)
			if (isPrime(i))
				PrimeList.add(i);
		return PrimeList;
	}

	public static void main(String args[]) {
		List<Integer> PrimeList = getPrime(2, 1000);
		System.out.println("2~1000以内的所有素数：");
		for (int i = 0; i != PrimeList.size(); ++i) {
			if (i > 0 && i % 5 == 0)
				System.out.println();
			int num=PrimeList.get(i);
			System.out.printf("%1$-6d",num);
		}
	}
}
```

## [12题](C3_12.java)

```java
package ntuJHW;

import java.util.Random;

public class C3_12 { // 生成100个1~6之间的随机数，统计每个数字出现概率
	public static int getIntRandom(int min, int max) { // 随机数获取
		Random random = new Random();
		int s = random.nextInt(max) % (max - min + 1) + min;
		return s;
	}

	public static void main(String args[]) {
		int arr[] = new int[6];
		for(int i=0;i!=arr.length;++i)
			arr[i]=0;
		for (int i = 0; i != 100; ++i)
			++arr[getIntRandom(0, 6)];
		System.out.print("概率为：");
		for (int i = 0; i != arr.length; ++i)
			System.out.printf(" %d%%", arr[i]);
	}
}
```

## [13题](C3_13.java)

```java
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
```

## [14题](C3_14.java)

```java
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
```

## [15题](C3_15.java)

```java
package ntuJHW;

public class C3_15 { // 用选择法对数组a[]={20,10,55,40,30,70,60,80,90,100}大到小排序
	public static void selectionSort(int[] arr, boolean dir) {
		int num, temp;
		if (dir)
			for (int i = 0; i < arr.length; i++) {
				num = i;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] < arr[num]) {
						num = j;
					}
				}
				if (num != i) {
					temp = arr[num];
					arr[num] = arr[i];
					arr[i] = temp;
				}
			}
		else
			for (int i = 0; i < arr.length; i++) {
				num = i;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] > arr[num]) {
						num = j;
					}
				}
				if (num != i) {
					temp = arr[num];
					arr[num] = arr[i];
					arr[i] = temp;
				}
			}
	}

	public static void main(String args[]) {
		int a[] = { 20, 10, 55, 40, 30, 70, 60, 80, 90, 100 };
		System.out.print("排序前：");
		for (int i = 0; i != a.length; ++i)
			System.out.printf(" %d ", a[i]);
		System.out.println();
		selectionSort(a, false);
		System.out.print("排序后：");
		for (int i = 0; i != a.length; ++i)
			System.out.printf(" %d ", a[i]);
		System.out.println();
	}
}
```

## [16题](C3_16.java)

```java
package ntuJHW;

import java.util.Random;

public class C3_16 { // 产生30个素数，按从小到大的顺序放入数组prime[]中（假设可以有相同素数，
					//	因素数可以无穷大无法产生真随机素数，只能选取范围内随机素数
	public static boolean isPrime(int num) {	//素数检测
		if (num < 1)
			return false;
		for (int i = 2; i < num / 2; ++i)
			if (num % i == 0)
				return false;
		return true;
	}

	public static int getIntRandom(int min, int max) {	//随机数获取
		Random random = new Random();
		int s = random.nextInt(max) % (max - min + 1) + min;
		return s;
	}

	public static void qSort(int[] arr, int head, int tail) { // 排序
		if (head >= tail || arr == null || arr.length <= 1) {
			return;
		}
		int i = head, j = tail, pivot = arr[(head + tail) / 2];
		while (i <= j) {
			while (arr[i] < pivot) {
				++i;
			}
			while (arr[j] > pivot) {
				--j;
			}
			if (i < j) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				++i;
				--j;
			} else if (i == j) {
				++i;
			}
		}
		qSort(arr, head, j);
		qSort(arr, i, tail);
	}

	public static void main(String args[]) {
		int prime[]=new int[30];
		for(int i=0;i!=30;++i) {
			int num=0;
			while(!isPrime(num))
				num=getIntRandom(1,1000);
			prime[i]=num;
		}
		qSort(prime,0,prime.length-1);
		System.out.print("结果：");
		for (int i = 0; i != prime.length; ++i)
			System.out.printf(" %d ", prime[i]);
		System.out.println();
	}
}
```

## [17题](C3_17.java)

```java
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
```

## [17题小应用](C3_17_applet.java)

```java
package ntuJHW;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class C3_17_applet extends Applet {	

// 求1000以内的完数（一个数自身等于它的因子之和）小应用程序版
	// PS. <applet>在HTML5中已经废弃了，不能再被使用。网页开发者应该使用更为通用的元素。
	// 若要在浏览器中使用，可使用IE6运行
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

	public void paint(Graphics g) {
		List<Integer> perfectNum = getPerfectNum(2, 1000);
		g.drawString("1000以内的完数有：",40,50);
		for (int i = 0; i != perfectNum.size(); ++i) {
			int num = perfectNum.get(i);
			g.drawString(String.valueOf(num), 40, i*12+60);
		}
	}
}
```

## [18题](C3_18.java)

```java
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
```