import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhap vao n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}