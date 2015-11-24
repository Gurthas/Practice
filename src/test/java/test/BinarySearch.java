package test;
/**
 * 二分法查找  a = { 0, 1, 3, 6, 7, 10, 21, 34, 36, 40, 76 }
 */
public class BinarySearch {

	public static int binarySearch(int[] a, int x) {
		// 在a[0]<=a[1]<=...<=a[n-1]中搜索x
		// 找到x则返回x的所在位置，否则返回-1
		int left = 0;
		int right = a.length - 1;

		while (left <= right) {
			int middle = (left + right) / 2;
			if (x == a[middle])
				return middle;
			if (x > a[middle])
				left = middle + 1;
			else
				right = middle - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 3, 6, 7, 10, 21, 34, 36, 40, 76 };
		int x = 34;// 设定要查找的数
		int position = binarySearch(a, x);
		System.out.println(x + "在数组中的位置是" + position);

	}
	
}
