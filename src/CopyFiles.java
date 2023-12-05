import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CopyFiles {
    ReadFromFile read = new ReadFromFile();
    WriteToFile w = new WriteToFile();
    private static final String DIRECTORY = "C:/Users/Саша/IdeaProjects/fiveHw/backup";
    private static final String FILES_DIRECTORY = "C:/Users/Саша/IdeaProjects/fiveHw";

    public void createDirectory(String directoryName) {
        File file = new File(directoryName);
        if(!file.exists()) {
            if(file.mkdir()) {
                System.out.println("Директория успешно создана!");
            } else {
                System.out.println("Что-то пошло не так");
            }
        } else {
            System.out.println("Директория уже существует");
        }
    }

    public List<File> copyFilesName(String filesDir) {
        List<File> filesTxt = new ArrayList<>();
        File folder = new File(filesDir);
        File[] files = folder.listFiles();
        for(File file : files) {
            if(file.isFile()) {
                filesTxt.add(file);
            }
        }
        return filesTxt;
    }

    public void copyFiles(List<File> listFiles) {

        for(File f : listFiles) {
            String fileName = f.getName();
            String result = read.readFromFile(fileName);
            w.write(new File("C:/Users/Саша/IdeaProjects/fiveHw/backup/"+fileName), result);
        }
    }

    public String getDirectory() {
        return DIRECTORY;
    }

    public String getFilesDirectory() {
        return FILES_DIRECTORY;
    }
}
