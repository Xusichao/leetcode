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

    /**
     * 摩尔投票算法
     * 首先众数是个数大于一半的数，所以肯定最多只有一个;其次，从第一选手开始闯关(没有回头路)，遇到“非我同类”就“同归于尽”，相反遇到“同类”就相伴而行，
     * 若最后我方拼得“弹尽粮绝”，就换这条路上的下一位选手从第一位选手倒下的节点继续闯关，值得注意的是，其实这位选手的“同类”在第一位选手(及“同类”)闯关的途中，
     * 也同时消耗了兵力，参与了战斗，所以从这个节点开始，重复之前的操作，继续拼杀，以此类推。若终点至少还有一人没有倒下，那这位选手必定为“天选之子”(众数)
     *
     * 作者：一个有梦想的girl
     * 链接：https://www.zhihu.com/question/49973163/answer/854621827
     * 来源：知乎
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public int mooreMajorityVote(int[] nums){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if (arrayList.isEmpty()){
                arrayList.add(nums[i]);
                continue;
            }
            if (nums[i] == arrayList.get(0)) arrayList.add(nums[i]);
            else arrayList.remove(0);
        }

        return arrayList.get(0);
    }

}
