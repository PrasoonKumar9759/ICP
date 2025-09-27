package Assignment2;

public class Leetcode367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(36));
    }
    public static boolean isPerfectSquare(int num) {
        long l=1,h=num;

        while(l<=h){
            long mid=l+(h-l)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid>num){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }
}
