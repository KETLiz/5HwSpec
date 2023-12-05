import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class WriteToFile {
    public void write(File fileName, String text) {
        try(FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(text);
        } catch(IOException e) {
            System.out.println("Не удалось записать данные в файл");
        }
    }

    public void write(String fileName, String text) {
        try(FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(text);
        } catch(IOException e) {
            System.out.println("Не удалось записать данные в файл");
        }
    }
}
