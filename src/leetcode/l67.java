package leetcode;

public class l67 {
    public String addBinary(String a, String b) {
        if(a.length()<b.length()) return addBinary(b,a);
        int du=0;
        //a dai hon b
        int na=a.length()-1;
        int nb=b.length()-1;
        int intA,intB,n;
        char[] arr = new char[na+1];
        while (nb>=0){
            intA = a.charAt(na)-48;
            intB = b.charAt(nb)-48;
            n=intA+intB+du;
            intA=n%2;
            du=Math.min(n-intA,1);
            arr[na] = (char) (intA+48);
            na--;
            nb--;
        }
        while (na>=0){
            intA = a.charAt(na)-48;
            n=intA+du;
            intA=n%2;
            du=Math.min(n-intA,1);
            arr[na] = (char) (intA+48);
            na--;
        }
        String result = String.copyValueOf(arr);
        if(du==0) return result;
        return "1"+result;
    }

    public static void main(String[] args) {
        l67 ins = new l67();
        System.out.println(ins.addBinary("11","1"));
    }
}
