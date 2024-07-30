import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        fun();
    }

    public static void fun() {
        Scanner sc = new Scanner(System.in);
        String s1;

        System.out.println("Enter string");
        s1 = sc.nextLine();
        int j = 0;
        int size=2 * (s1.length());
        char s2[] = new char[size];
        for (int i = 0; i <size/2;i++) {
            s2[j] = s1.charAt(i);
            j++;
            s2[j] = s1.charAt(i);
            j++;
            
        }

        String result = new String(s2);
        System.out.println(result); // print the result
    }
}