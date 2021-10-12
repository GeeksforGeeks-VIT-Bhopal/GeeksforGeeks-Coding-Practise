// Done by https://github.com/eredrolo
import java.util.Scanner;

class zeroToFive {

    String convertFive(int N) {
        int num = 0;
        String newNo = "";
        for (int x = N; x != 0; x /= 10) {
            num = x % 10;
            if (num == 0)
                num = 5;
            newNo = (Integer.toString(num) + newNo);
        }
        return newNo;
    }

    public static void main(String args[]) {
        zeroToFive ob = new zeroToFive();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        String ans = ob.convertFive(N);
        System.out.println(ans);
        sc.close();
    }
}