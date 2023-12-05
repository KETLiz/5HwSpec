import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class WriteToFile {

    /**
     * Запись текста в файл
     * @param fileName объект класса File, куда записываем текст text
     * @param text
     */
    public void write(File fileName, String text) {
        try(FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(text);
        } catch(IOException e) {
            System.out.println("Не удалось записать данные в файл");
        }
    }

    /**
     * Запись текста в файл
     * @param fileName название файла, куда записываем текст text
     * @param text
     */
    public void write(String fileName, String text) {
        try(FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(text);
        } catch(IOException e) {
            System.out.println("Не удалось записать данные в файл");
        }
    }
}
