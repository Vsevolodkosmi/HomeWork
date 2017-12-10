//4. Вводимо число з плаваючою точкою і перевіряємо чи це число в діапазоні від 0 до 1.

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        System.out.print("Please enter the Double:  ");
        Scanner scanner = new Scanner(System.in);
        double userNumber = scanner.nextDouble();
        if(userNumber>0 && userNumber<1) {
            System.out.println(userNumber);
        }


        else {
            System.out.println("Error");
        }
    }
    }
