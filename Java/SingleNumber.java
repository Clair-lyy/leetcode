import java.util.BitSet;
import java.util.Iterator;

public class SingleNumber {

    public static int getSingleNum1(int[] nums) {
        int s = 0;
        for (int num : nums) {
            s ^= num;
        }
        return s;
    }

    public static int getSingleNum2(int[] nums) {
        BitSet bitSet = new BitSet();
        for (int num : nums) {
            bitSet.set(num, !bitSet.get(num));
        }
        Iterator<Integer> iterator = bitSet.stream().iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 3, 4, 5, 7, 7, 5};
        System.out.println(getSingleNum1(nums));
        System.out.println(getSingleNum2(nums));
    }
}