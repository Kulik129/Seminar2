import java.util.Scanner;
public class prog {
    public static void main(String[] args) {
        kalkulyalor(); //1 шаг. Открытие калькулятора
    }

    static void yes_no(){
        kalkulyalor();
    }

    static void  kalkulyalor(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число 1: ");
        int number1 = iScanner.nextInt();
        System.out.printf("Введите число 2: ");
        int number2 = iScanner.nextInt();
        System.out.print("Введите операцию ");
        String operation = iScanner.next();
        // iScanner.close(); Выходит ошибка Exception in thread "main" java.lang.IllegalStateException: Scanner closed 
        switch(operation){
            case "+":
            System.out.println(number1+number2);
            Scanner iScanner1 = new Scanner(System.in);
            System.out.println("Введите 1 если хотите продолжить!\nВведите 2 если хотите остановить!");
            Integer message_sum = iScanner.nextInt();
            if (message_sum == 1) {
                yes_no();
            } else if (message_sum == 2) {
                System.out.println("bay");
            }
            iScanner1.close();
                break;

            case "*":
            System.out.println(number1*number2);
            Scanner iScanner3 = new Scanner(System.in);
            System.out.println("Введите 1 если хотите продолжить!\nВведите 2 если хотите остановить!");
            Integer message_mult = iScanner.nextInt();
            if (message_mult == 1) {
                yes_no();
            } else if (message_mult == 2) {
                System.out.println("bay");
            }
            iScanner3.close();
                break;

            case "/":
            System.out.println(number1/number2);
            Scanner iScanner4 = new Scanner(System.in);
            System.out.println("Введите 1 если хотите продолжить!\nВведите 2 если хотите остановить!");
            Integer message_div = iScanner.nextInt();
            if (message_div == 1) {
                yes_no();
            } else if (message_div == 2) {
                System.out.println("bay");
            }
            iScanner4.close();
                break;

            case "-":
            System.out.println(number1-number2);
            Scanner iScanner5 = new Scanner(System.in);
            System.out.println("Введите 1 если хотите продолжить!\nВведите 2 если хотите остановить!");
            Integer message_sub = iScanner.nextInt();
            if (message_sub == 1) {
                yes_no();
            } else if (message_sub == 2) {
                System.out.println("bay");
            }
            iScanner5.close();
                break;
            
            
        }
        // iScanner.close(); Выходит ошибка Exception in thread "main" java.lang.IllegalStateException: Scanner closed 
    }
}
