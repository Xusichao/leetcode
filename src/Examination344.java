/**
 * 反转字符串
 */
public class Examination344 {
    public void reverseString(char[] s) {
        if (s.length <= 0) return;
        for (int i=0;i<s.length;i++){
            if (s.length-1-i < i) break;
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
        System.out.println(s);
    }
}
