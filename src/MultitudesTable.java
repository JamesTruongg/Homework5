import java.util.Scanner;

public class MultitudesTable {
    public static void main(String[] args) {
        System.out.print("Nhap mot so đe tao bang cuu chuong: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Bang cuu chuong cua " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }

}