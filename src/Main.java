import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PrintTree pt = new PrintTree();
        pt.print(new File("."), " ");

        WriteToFile w = new WriteToFile();
        w.write(new File("./java.txt"), "Я лежу на сочинском пляжу \n" +
                "И в Идею милую гляжу. ");
        w.write("java2.txt", "Я на Джаве серверной пишу \n" +
                "И на Котлин с завистью гляжу");

        CopyFiles copy = new CopyFiles();
        copy.createDirectory(copy.getDirectory());
        List<File> l = copy.copyFilesName(copy.getFilesDirectory());
        copy.copyFiles(l);

//        ReadFromFile r = new ReadFromFile();
//        System.out.println(r.readFromFile("java.txt"));
//        System.out.println(r.readFromFile("java2.txt"));
    }
}