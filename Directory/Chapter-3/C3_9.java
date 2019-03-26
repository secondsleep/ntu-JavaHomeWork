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
