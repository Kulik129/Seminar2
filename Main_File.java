import java.util.Scanner;

public class Main_File {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Добрый день!\nНажмите 1 для проверки 1-го задания\nНажмите 2 для проверки 2-го задания");
        String in = iScanner.next();
        switch (in) {
            case "1":
                Programing_file.WriteTest();
                break;
            case "2":
                Programing_file.ReadScanner();
            default:
                break;
        }   
        iScanner.close();
    }
}