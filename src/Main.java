import java.io.File;

public class Main {
    public static void main(String[] args) {
//        Print2 pt = new Print2();
//        pt.print(new File("."), " ", true);
        PrintTree pt = new PrintTree();
        pt.print(new File("."), " ");
    }
}