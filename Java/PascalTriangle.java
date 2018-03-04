import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

    public static List<Integer> getKth1(int k) {
        List<Integer> result = new ArrayList<>();
        if (k == 1) {
            result.add(1);
            return result;
        } else if (k == 2) {
            result.add(1);
            result.add(1);
            return result;
        }
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        tmp.add(1);
        for (int i = 3; i <= k; i++) {
            result = new ArrayList<>();
            result.add(1);
            for (int j = 0; j < tmp.size() - 1; j++) {
                result.add(tmp.get(j) + tmp.get(j + 1));
            }
            result.add(1);
            tmp = result;
        }
        return result;
    }

    public static List<Integer> getKth2(int k) {
        if (k == 1) {
            return Arrays.asList(1);
        }
        if (k == 2) {
            return Arrays.asList(1, 1);
        }
        List<Integer> result = new LinkedList<>();
        result.add(1);
        result.add(1);
        for (int i = 3; i <= k; i++) {
            for (int j = 0; j < result.size()-1; j++) {
                result.set(j, result.get(j) + result.get(j + 1));
            }
            result.add(0,1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getKth1(7));
        System.out.println(getKth2(7));
    }
}
