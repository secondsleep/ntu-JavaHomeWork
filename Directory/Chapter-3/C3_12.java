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
