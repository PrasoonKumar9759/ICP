
import java.util.Arrays;
import java.util.Comparator;

public class leetcode452 {
    public static void main(String[] args) {
        int[][] arr={{-2147483646,-2147483645},{2147483646,2147483647}};
        System.out.println(findMinArrowShots(arr));
    }
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1],o2[1]);
            }
        });
        int ans=1;
        int s=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>s){
                ans++;
                s=points[i][1];
            }
        }
        
        return ans;

    }
}
