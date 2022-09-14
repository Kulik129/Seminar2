import java.io.FileReader;
import java.io.FileWriter;

public class progs {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            write();
        }
    }

    static void write(){
        try (FileWriter writer = new FileWriter("file.txt",true)) {
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

    static void read() {
        try (FileReader reader = new FileReader("file.txt")) {
            int c;
            while ((c=reader.read())!=-1) {
                System.out.println((char)c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
