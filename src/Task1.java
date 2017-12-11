 import java.util.Scanner;

    public class Task1 {

        public static void main(String[] args) {

            int work = 9;
            int home= 18;

            System.out.print("Please enter the number:  ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            if(userNumber >= work&& userNumber <= home) {
                System.out.println("I am at work");
            } else {
                System.out.println("I rest");
            }
        }
    }
