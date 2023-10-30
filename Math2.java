package les12;

public class Math2 {
    public final static int getSum(int i, int i2, int i3) {
        return i + i2 + i3;
    }

    public final static int getResult(int i, int i2, int i3) {
        return i * i2 * i3;
    }

    public final static int getMax(int i1, int i2, int i3) {
        int max = i1;

        if (i2 > max)
            max = i2;
        if (i3 > max)
            max = i3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getMax(78, 79, 89));
    }
}
