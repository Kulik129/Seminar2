import java.util.Scanner;
public class prog {
    public static void main(String[] args) {
        say(); //1 шаг. Открытие калькулятора
        yes(); //2 шаг. Открытие условия "да продолжить" "нет отмена"
    }

    static void yes(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите ДА если хотите продолжить!"); 
        String b = iScanner.nextLine();
        switch(b){
            case "да":
            while (true) {
                say();
                yes();
            }
        }
        iScanner.close();
    }

    static void  say(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число 1: ");
        int number1 = iScanner.nextInt();
        System.out.printf("Введите число 2: ");
        int number2 = iScanner.nextInt();
        System.out.print("Введите операцию ");
        String operation = iScanner.next();
        switch(operation){
            case "+":
            System.out.println(number1+number2);
                break;
            case "*":
            System.out.println(number1*number2);
                break;
            case "/":
            System.out.println(number1/number2);
                break;
            case "-":
            System.out.println(number1-number2);
                break;
            
            
        }
    }
}
