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
