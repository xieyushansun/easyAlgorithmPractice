import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

class Solution3 {
    public int[] printNumbers(int n) {
        int max = (int)Math.pow(10, n);
        int[] arr=new int[max];
        for (int i = 0; i < max; i++) {
            arr[i] = i;
        }
        return arr;
    }
}