import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;

public class ReadFromFile {

    /**
     * Метод чтения данных из файла
     * @param file название файла
     * @return строку с содержимым файла
     */
    public String readFromFile(String file) {
        try(FileReader reader = new FileReader(file)) {
            int i = 0;
            StringBuilder res = new StringBuilder();
            while((i = reader.read()) != -1) {
                res.append((char)i);
            }
            return res.toString();
        } catch(IOException e) {
            System.out.println("Что-то пошло не так");
        }
        return null;
    }

}
