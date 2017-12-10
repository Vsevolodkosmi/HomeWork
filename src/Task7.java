/*
 Вводимо два числа, якшо одне з них ділить без залишку на інше, то виводимо true і показуємо результат ділення.
  В іншому випадку виводимо false і результат ділення (цілу частину і залишок).

 */

import java.util.Scanner;
public class Task7 {


    public static void main(String[] args) {

        System.out.print("Please enter the number1, number2:  ");
        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();
        int userNumber2 = scanner.nextInt();
        int number4 = userNumber1/userNumber2;
        int number3 = userNumber1%userNumber2;
        if(number3==0) {
            System.out.println("true;" + number4);
        }
        else {
            System.out.println("false;" +number4 + ","+ number3);
        }
    }}