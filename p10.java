public class p10 {
    public static void main(String[] args) {
        String s = "CHARUSAT UNIVERSITY";
        System.out.println(s);

        char ch[] = s.toCharArray();
        ch[1] = 'D';
        String j = new String(ch);

        System.out.println(j);
       
        System.out.println( j.toLowerCase());
    }
}