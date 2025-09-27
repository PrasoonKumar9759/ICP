package Assignment2;

import java.util.Arrays;

public class Leetcode88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
      int i=0;
      int j=0;
      int k=0;
      int[] fin=new int[n+m];
      while(i<m && j<n){
          if(nums1[i]<=nums2[j]){
              fin[k]=nums1[i];
              i++;

          }else{
              fin[k]=nums2[j];
              j++;

          }
          k++;
      }
      while(i<m){
          fin[k]=nums1[i];
          i++;
          k++;
      }
      while(j<n){
          fin[k]=nums2[j];
          j++;
          k++;
      }
//        System.out.println(Arrays.toString(fin));
    for(int al=0;al< nums1.length;al++){
        nums1[al]=fin[al];
    }
    }

    public static void main(String[] args) {
        int[] n1={1,2,3,0,0,0};
        int[] n2={1,3,5};
        merge(n1,3,n2,3);
        System.out.println(Arrays.toString(n1));

    }
}
