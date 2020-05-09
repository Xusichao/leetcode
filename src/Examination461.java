/**
 * 汉明距离
 */
public class Examination461 {
    public static int hammingDistance(int x, int y) {
        /* 异或之后，i为二进制数 */
        int i = x ^ y;
        int count = 0;
        while (i != 0){
            if (i % 2 == 1){
                /* 取模后余数为1说明最低位一定为1 */
                count ++;
            }
            i = i >> 1;
        }
        return count;
    }
}
