import LearnPattern.a;

/**
 * Created by  manhpd.ho on 01/11/2021
 */
public class LearnAvai {
    public static void main(String[] args) {
        a  a = new a();
        System.out.println(test(a).a); //5
        System.out.println(a.a);//5
        a = test(a);
        System.out.println(a);//5
    }
    public static a test(a a){
        a.a("1");
        return a;
    }
}
