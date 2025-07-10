import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        read("src/textFileRead.txt");
        write("src/textFileWrite.txt");
        read("src/textFileWrite.txt");

    }

    public static void write(String textFile) {
        try( FileWriter writer = new FileWriter(textFile)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите текст: ");
            String text = sc.nextLine();
            writer.write(text);
        } catch (IOException e) {
            throw new FileWorkException("Ошибка при записи в файл " + textFile + ".", e);
        }
    }

    public static void read(String textFile) {
        try(BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new FileWorkException("Файл " + textFile + " не найден.", e);
        } catch (IOException e) {
            throw new FileWorkException("Ошибка чтения файла " + textFile + ".", e);
        }
    }
}