/**
 * 位1的个数
 */
public class Examination191 {
    public int hammingWeight(int n) {
        int result = 0;
        int mask = 0;
        for (int i=0;i<32;i++){
            if ((n|mask) == 1) result++;
            mask >>= 1;
        }
        return result;
    }
}
