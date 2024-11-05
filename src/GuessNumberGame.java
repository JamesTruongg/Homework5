import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
        public static void main(String[] args) {
            Random random = new Random();
            int Sodoan  = random.nextInt(50) + 1;
            System.out.println("Hay doan so dung tu 1 - 50");
            int guess = 0;
            while (guess != Sodoan){
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap vao so cua ban: ");
                guess = sc.nextInt();
                if(guess < Sodoan){
                    System.out.println("So cua ban thap hon!");
                }
                else if(guess > Sodoan){
                    System.out.println("So cua ban cao hon!");
                }
                else{
                    System.out.println("Ban da doan dung so" + Sodoan);
                }
            }
        }
    }


