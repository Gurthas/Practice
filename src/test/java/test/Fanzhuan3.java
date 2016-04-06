package test;

/**
 * Created by yupeng on 16/4/6.
 */
public class Fanzhuan3 {
    public static void main(String[] args) {
        String str = "Gurthas";
        char[] chars = str.toCharArray();
        int right = chars.length - 1;
        int left = 0;
        while (left < right) {
            swap(left, right, chars);
            left++;
            right--;
        }
        printArray(chars);
    }


    /**
     * 交换数组中i,j内容
     *
     * @param i
     * @param j
     * @param array
     */
    public static void swap(int i, int j, char[] array) {
        char c = array[i];
        array[i] = array[j];
        array[j] = c;
    }


    /**
     * 输出打印字符串
     *
     * @param array
     */
    public static void printArray(char[] array) {
        System.out.println(new String(array));
    }
}
