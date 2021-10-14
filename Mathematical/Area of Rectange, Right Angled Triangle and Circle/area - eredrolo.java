// Done by https://github.com/eredrolo
import java.util.Scanner;

public class area {

    String getAreas(int L, int W, int B, int H, int R) {
        int rectangle = (int)(L*W);
        int triangle = (int)(0.5*B*H);
        int circle = (int)(3.14*R*R);
        String ans = Integer.toString(rectangle) + " " + Integer.toString(triangle) + " " + Integer.toString(circle);
        return ans;
    }

    public static void main(String args[]) {
        area ob = new area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int L = sc.nextInt();
        System.out.print("Enter Width: ");
        int W = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int B = sc.nextInt();
        System.out.print("Enter Height: ");
        int H = sc.nextInt();
        System.out.print("Enter Radius: ");
        int R = sc.nextInt();
        String ans = ob.getAreas(L, W, B, H, R);
        System.out.println(ans);
        sc.close();
    }
}