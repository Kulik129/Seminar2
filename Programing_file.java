import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Programing_file {
    public static void main(String[] args) {
        
    }

    static void write(){   //Записывает информацию в файл
        try (FileWriter writer = new FileWriter("Test.txt",true)) {
            String text = "TEST";
            String text2 = "test";
            writer.write(text);
            // writer.append('\n');
            writer.write(text2);
            // writer.append('\n');
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void WriteTest(){  // Записывает слово Testtest 100 раз
        for (int i = 0; i < 50; i++) {
            write();
        }
    }

    static void read() {   //Считывает весь файл
        try (FileReader reader = new FileReader("file.txt")) {
            int c;
            while ((c=reader.read())!=-1) {
                System.out.print((char)c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    


    static void ReadScanner() {       // Выводит информацию из файла в формате Имя и Отценка
        try {
            File file = new File("file.txt");
            Scanner scanners = new Scanner(file);

            while (scanners.hasNextLine()) {
                String name = scanners.next();
                String grade = scanners.next();
                System.out.printf("Ученик %s полчучил %s\n",name,grade);
            }
            scanners.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void ReadFile() {  // Считывает весь файл
        BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
                "/Users/mitya.kulikbk.ru/Desktop/Новая папка 2/file.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
