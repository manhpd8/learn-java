package leetcode;

public class l167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] duong = new int[1001];
        int[] am = new int[1001];
        for(int i=0;i<1001;i++){
            duong[i]=-1;
            am[i]=-1;
        }
        int soPhu;
        for(int i=0;i<numbers.length;i++){
            soPhu = target - numbers[i];
            if(soPhu>1000 || soPhu<-1000) continue;
            if(soPhu>0){
                if(duong[soPhu]>=0){
                    if(numbers[i] < soPhu){
                        return new int[]{i+1 , duong[soPhu]+1};
                    } else {
                        return new int[]{duong[soPhu]+1,i+1};
                    }
                }

            } else {
                if(am[Math.abs(soPhu)]>=0){
                    if(numbers[i] < soPhu){
                        return new int[]{i+1 , am[Math.abs(soPhu)]+1};
                    } else {
                        return new int[]{am[Math.abs(soPhu)]+1,i+1};
                    }
                }

            }
            if(numbers[i] >0) duong[numbers[i]]=i;
            else am[Math.abs(numbers[i])] = i;
        }
        return null;
    }
}
