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
