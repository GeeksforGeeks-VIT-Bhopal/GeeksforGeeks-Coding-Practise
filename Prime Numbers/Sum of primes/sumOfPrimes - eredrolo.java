// Done by https://github.com/eredrolo
import java.util.Scanner;

public class sumOfPrimes {

    int primeSum(int N) {
        int num = 0, c = 0, sum = 0;
        for (int x = N; x != 0; x /= 10) {
            num = x % 10;
            for (int y = 1; y < num; y++) {
                if (num == 1) break;
                if (num % y == 0) {
                    c++;
                    if (c > 2)
                        break;
                }
            }
            if (c < 2 && num != 1)
                sum += num;
            c = 0;
        }
        return sum;
    }

    public static void main(String args[]) {
        sumOfPrimes ob = new sumOfPrimes();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int ans = ob.primeSum(N);
        System.out.println(ans);
        sc.close();
    }
}