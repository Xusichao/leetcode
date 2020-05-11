import java.util.*;

/**
 * 找出多数元素
 */
public class Examination169 {

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

    /**
     * 排序法：
     * 因为“多数元素”是一个拥有超过n/2的数，所以对数组进行排序，第n/2一定是多数元素
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /**
     * 冒泡排序
     * @param nums
     * @return
     */
    public int[] bubbleSort(int[] nums){
        if (nums.length == 0){
            return nums;
        }
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length-1-i;j++){
                if (nums[j+1] < nums[j]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

}
