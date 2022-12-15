package leetcode;

public class l1342 {
    public int numberOfSteps(int num) {
        int dem=0;
        while(num >0) {
            if(num %2==0) num /=2;
            else num--;
            dem++;
        }
        return dem;
    }
}
