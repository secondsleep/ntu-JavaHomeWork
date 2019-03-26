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
