public class p21 {
    public static void main(String[] args) {
        AdvancedArithmetic a=new AdvancedArithmetic();

       System.out.println(a.divisorSum(6));
        
    }
}
class AdvancedArithmetic
{
    public  int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                }
                }
                return sum;

}
}
