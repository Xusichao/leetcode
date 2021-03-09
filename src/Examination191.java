/**
 * 位1的个数
 */
public class Examination191 {
    /**
     * 先设置位掩码mask = 1，等同于mask = 001
     * 将mask和n做’与’运算，mask & n = 001 & 010 = 0，所以n的最后一位是0
     * 将mask左移一位，得到mask = 010，再和n做’与’运算，mask & n = 010 & 010 = 1，所以n的倒数第二位是1
     * 将mask左移一位，得到mask = 100，再和n做’与’运算，mask & n = 100 & 010 = 1，所以n的倒数第三位是0
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int result = 0;
        int mask = 1;
        for (int i=0;i<32;i++){
            if ((n&mask) != 0) result++;
            mask <<= 1;
        }
        return result;
    }
}
