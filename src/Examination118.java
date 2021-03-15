import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class Examination118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        int startNum = 1;
        List<List<Integer>> out = new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            if (i == 0 && out.size() == 0){
                row.add(1);
            }else {
                List<Integer> last = out.get(i-1);
                for (int n=0;n<last.size()+1;n++){
                    int item;
                    if (n == 0 || n == last.size()+1-1){
                        item = 0 + last.get(n);
                    }else {
                        item = last.get(n-1) + last.get(n);
                    }
                    row.add(item);
                }
            }
            out.add(row);
        }
        return out;
    }

}
