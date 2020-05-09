import java.util.*;

/**
 * 找出多数元素
 */
public class Examination169 {
    public int majorityElement(int[] nums) {
        return 0;
    }

    /**
     * 使用哈希表实现
     * @param nums
     * @return
     */
    public int useHashMap(int[] nums){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums){
            if (hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i).intValue()+1);
            }else {
                hashMap.put(i,1);
            }
        }
        List<Map.Entry<Integer,Integer>> allValue = new ArrayList<Map.Entry<Integer,Integer>>(hashMap.entrySet());
        allValue.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        return allValue.get(0).getKey();
    }
}
