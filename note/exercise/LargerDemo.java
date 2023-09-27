public class LargerDemo {
    ///声明一个方法，返回两个数中较大的一个
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(8, 10));
    }
}

