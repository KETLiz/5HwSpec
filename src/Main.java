import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Распечатываем дерево с файловой системой папки fiveHw
         */
        PrintTree pt = new PrintTree();
        pt.print(new File("."), " ");

        /**
         * Создаём 2 текстовых файла в папке fiveHw
         */
        WriteToFile w = new WriteToFile();
        w.write(new File("./java.txt"), "Я лежу на сочинском пляжу \n" +
                "И в Идею милую гляжу. ");
        w.write("java2.txt", "Я на Джаве серверной пишу \n" +
                "И на Котлин с завистью гляжу");

        /**
         * Создаём резервную копию всех файлов в директорию ./backup
         */
        CopyFiles copy = new CopyFiles();
        copy.createDirectory(copy.getDirectory());
        List<File> l = copy.copyFilesName(copy.getFilesDirectory());
        copy.copyFiles(l);

    }
}