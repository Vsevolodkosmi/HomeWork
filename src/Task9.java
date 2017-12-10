/*Порахувати скільки разів зустрічається 5 в заданому числі, яке вводить користувач

           435  -   1
           505  -   2
           555  -   3
           305    - 1*/

import java.util.Scanner;
public class Task9 {


    public static void main(String[] args) {

        System.out.print("Please enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();
        int count = 0;
        while (userNumber1 > 0){
            if ((userNumber1 % 10) == 5)
                count ++;
            userNumber1 /=10;
        }
        System.out.println("count="+count);

    }}