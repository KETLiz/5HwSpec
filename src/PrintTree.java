import java.io.File;
public class PrintTree {

    public void print(File folder, String indent) {
        File[] files = folder.listFiles();
        if(files == null) {
            return;
        }
//        System.out.print("└");
//        System.out.print("fiveHw\n");
        for(int i = 0; i < files.length; i++) {
            if(i == files.length - 1) {
                System.out.print(indent + "╚");
                System.out.println(files[i].getName());
                if(files[i].isDirectory()) {
                    print(files[i], indent + " ");
                }
            } else {
                System.out.print(indent + "╠");
                System.out.println(files[i].getName());
                if(files[i].isDirectory()) {
                    print(files[i], indent+"║"+indent);
                }
            }

        }
    }
}
