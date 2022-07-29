package hackerank;

import java.util.*;

/**
 * Created by  manhpd.ho on 26/05/2022
 */
public class duplicateword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        while (n>0){
            String s = in.nextLine();
            s=s.trim().replaceAll("\\s+", " ");
            Set<String> setA = new HashSet<String>();
            StringBuilder result = new StringBuilder();
            for (String s1: s.split(" ")) {
                if(!setA.contains(s1.toLowerCase())) {
                    setA.add(s1.toLowerCase());
                    result.append(" " + s1);
                }
            }
            System.out.println(result.toString().trim());
            n--;
        }
    }
}
