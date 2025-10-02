class Solution {
    public static void main(String[] args){
        int[] arr={5,5,5,10,20};
        System.out.print(lemonadeChange(arr));
    }
    public boolean lemonadeChange(int[] bills) {
        if(bills.length==1 && bills[0]!=5) return false;
        int cfive=0;
        int cten=0;
        int ctwen=0;
        if(bills[0]==5){
            cfive++;
        }else if(bills[0]==10){
            cten++;
        }else{
            ctwen++;
        }
        for(int i=1;i<bills.length;i++){
            if(bills[i]==5){
                cfive++;
            }
            else if(bills[i]==10){
                if(cfive>0){
                    cfive--;
                    cten++;
                }else{
                    return false;
                }
            }else if(bills[i]==20){
                if(cfive>0 && cten>0){
                    ctwen++;
                    cten--;
                    cfive--;
                }else if(cfive>=3){
                    cfive-=3;
                    ctwen++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}