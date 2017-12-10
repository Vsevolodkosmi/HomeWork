//Вводимо два числа. Виводимо їх додаток, якшо він в діапазоні від 11 до 19.

import java.util.Scanner;
public class Task6 {


    public static void main(String[] args) {

        System.out.print("Please enter the number1, number2:  ");
        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();
        int userNumber2 = scanner.nextInt();
        int sumNumber = userNumber1+userNumber2;
        if(sumNumber>=11 && sumNumber<=19) {
            System.out.println(sumNumber);
        }
        else {
            System.out.println("Error");
        }
    }}
