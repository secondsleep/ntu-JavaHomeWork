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
