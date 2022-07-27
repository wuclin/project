public class reverseLeftWords {
    public String reverseLeftWords(String s, int n){
        char[] ch = s.toCharArray();
        swap(ch,0,ch.length-1);
        swap(ch,0,ch.length-n-1);
        swap(ch,ch.length-n,ch.length-1);

        String reverseS = new String(ch);

        return reverseS;
    }
    void swap(char[] ch,int start, int end){
        for (int i = start; i <= (end+start)/2; i++) {
            char tmp = ch[i];
            ch[i] = ch[end+start -i];
            ch[end+start -i] = tmp;
        }
    }
}
