/*Вводимо два числа. Порівняти останні цифри цих чисел (користуємося оператором %)

    			124    4    -   true
     			1456   567  -   false
     			1      2    -   false
    			18     98   -   true */

import java.util.Scanner;
public class Task8 {


    public static void main(String[] args) {

        System.out.print("Please enter the number1, number2:  ");
        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();
        int userNumber2 = scanner.nextInt();
        int number4 = userNumber1%10;
        int number3 = userNumber2%10;
        if(number3==number4) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }}