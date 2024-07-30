import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a string: ");
        s = sc.nextLine();
        int n;
        System.out.println("Enter number");
        n = sc.nextInt();
        cal(s, n);
    }

    public static void cal(String x, int y) {
        if (x.length() >= y) {
            for (int i = 0; i < y; i++) {
                System.out.println(x.substring(0, y));
            }
        } 
        if (  x.length()<y) {
            for (int i = 0; i < y; i++) {
              
                    System.out.println(x);
                    
                } 
            }
                    
                
            
        }
    }
