package leetcode;

public class l387 {
    public int firstUniqChar(String s) {
        int[] mark = new int[26];
        int[] markIndex = new int[26];
        int indexMin = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            int id = s.charAt(i)-'a';
            mark[id]++;
            markIndex[id] =i;

        }
        for(int i=0;i<mark.length;i++){
            if(mark[i]==1 &&  markIndex[i]<indexMin){
                indexMin = markIndex[i];
            }
        }
        if(indexMin <Integer.MAX_VALUE) return indexMin;
        return -1;
    }

    public static void main(String[] args) {
        l387 ins = new l387();
        System.out.println(ins.firstUniqChar("itwqbtcdprfsuprkrjkausiterybzncbmdvkgljxuekizvaivszowqtmrttiihervpncztuoljftlxybpgwnjb"));
    }
}
