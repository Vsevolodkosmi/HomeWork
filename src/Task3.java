//Користувач вводить число. Вивести на екран його подвоєне значення, якшо число ділиться на 7 без залишку.

import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {

        System.out.print("Please enter the number:  ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();
        int number1 = userNumber % 7;
        if(number1==0) {
            System.out.println(userNumber*userNumber);
        }


        else {
            System.out.println("Error");
        }
    }
}
