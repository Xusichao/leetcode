import java.util.*;

/**
 * 只出现一次的数字
 */
public class Examination136 {
    /**
     * 普通遍历实现
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        List arrayList = new ArrayList();
        for (int i=0;i<nums.length;i++){
            if (arrayList.contains(nums[i])){
                arrayList.remove(arrayList.indexOf(nums[i]));
            }else {
                arrayList.add(nums[i]);
            }
        }
        return (int)arrayList.get(0);
    }

    /**
     * 哈希集实现
     * @param nums
     * @return
     */
    public int useHashSet(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums){
            if (!hashSet.add(i))
                hashSet.remove(i);
        }

        Iterator<Integer> iterator = hashSet.iterator();
        return iterator.next();
    }

    /**
     * 异或实现
     * @param nums
     * @return
     */
    public int useXOR(int[] nums){
        int x = 0;
        for (int i : nums){
            x ^= i;
        }
        return x;
    }
}
