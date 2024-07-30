import java.util.Scanner;

public class p101 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = sc.nextLine();
        System.out.println("The string is: " + s);
        char ch[] = s.toCharArray();
        int size = s.length();
        char cc[]=new char[size] ;
        int i;
        int j;

        for (i = 0; i < size; i++) {
            int c = 0;
            for (j = i + 1; j < size; j++) {
                if (ch[i] == ch[j]) {
                    cc[i]=ch[i];
                    c++;
                }
            }
           if(c!=0){
            System.out.println(cc[i] + " is times " + (c + 1));
           }
           
        }
    }
}