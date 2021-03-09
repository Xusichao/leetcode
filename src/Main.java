import PublicClass.ListNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Examination118 examination = new Examination118();
        int n = 8;
        List<List<Integer>> result = examination.generate(n);
        for (int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }
}
