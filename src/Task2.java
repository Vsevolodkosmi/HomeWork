import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {

 System.out.print("Please enter the number 1, number 2, number 3:  ");
    Scanner scanner = new Scanner(System.in);
    int userNumber1 = scanner.nextInt();
    int userNumber2 = scanner.nextInt();
    int userNumber3 = scanner.nextInt();//uvguvgu
        if(userNumber1 > userNumber2 && userNumber1 > userNumber3) {
            System.out.println(userNumber1);
        } else if(userNumber2 > userNumber1 && userNumber2 > userNumber3) {
            System.out.println(userNumber2);
        } else if(userNumber3 > userNumber1 && userNumber3 > userNumber2) {
            System.out.println(userNumber3);
}

}}

//Користувач вводить три числа з консолі - потрібно вивести на консоль найбільше і найменше.
