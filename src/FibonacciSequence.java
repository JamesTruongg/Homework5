
    import java.util.Scanner;

    public class FibonacciSequence {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap so phan tu cua day Fibonacci can in: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Vui long nhap so nguyen duong lon hon 0.");
            } else {
                int f0 = 0, f1 = 1;

                System.out.print("Day Fibonacci: ");

                for (int i = 1; i <= n; i++) {
                    System.out.print(f0 + " ");


                    int fn = f0 + f1;
                    f0 = f1;
                    f1 = fn;
                }
            }
        }
    }


