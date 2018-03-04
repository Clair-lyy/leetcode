public class MostWater {
    public static int getMostWater(int[] containers) {
        int i = 0;
        int j = containers.length - 1;
        int max = 0;
        while (i < j) {
            int height = containers[i] < containers[j] ? containers[i] : containers[j];
            int ans = (j - i) * height;
            max = max > ans ? max : ans;
            if(containers[i]<containers[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getMostWater(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
    }
}
