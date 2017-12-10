/* Вводимо 2 числа. Якшо перше число більше другого, то виводимо на консоль різницю цих чисел.
  В іншому випадку то виводимо добуток */

import java.util.Scanner;
public class Task5 {


        public static void main(String[] args) {

            System.out.print("Please enter the number1, number2:  ");
            Scanner scanner = new Scanner(System.in);
            int userNumber1 = scanner.nextInt();
            int userNumber2 = scanner.nextInt();
            if(userNumber1>userNumber2) {
                System.out.println(userNumber1-userNumber2);
            }
            else {
                System.out.println(userNumber1*userNumber2);
            }
        }


}
