public class MaxNumber {
    /* 从数组中返回最大值 */
    public static int max(int[] m) {
        int maxNumber = m[0];
        for (int i = 0; i<m.length; i++) {
            if (m[i] > maxNumber) {
                maxNumber = m[i];
            } 
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
