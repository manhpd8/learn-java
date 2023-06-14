package leetcode;

public class l6307 {
    public int passThePillow(int n, int time) {
        if(time<n) return time+1;
        int lan = time/(n-1);
        int du = time%(n-1);
        if(lan%2==1){
            //le thi giam
            return n-du;
        } else {
            //chan thi tang
            return du+1;
        }
    }

    public static void main(String[] args) {
        l6307 ins = new l6307();
        System.out.println(ins.passThePillow(18,38));
    }
}
