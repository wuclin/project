public class fifth {
    public static void main(String[] args){
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }

    public static String replaceSpace(String s){
        if (s.length()==0 || s == null)
            return "";

        int count = 0;
        for (int i=0; i<s.length();i++)
            if (s.charAt(i) == ' ')
                count++;
        char[] s1 = new char[s.length() + count*2];

        int size = 0;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == ' '){
                s1[size++] = '%';
                s1[size++] = '2';
                s1[size++] = '0';
            }else
                s1[size++] = c;

        }
        String newS = new String(s1,0,size);

        return newS;
    }
}
