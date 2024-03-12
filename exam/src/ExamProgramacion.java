import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ExamProgramacion {
    static ArrayList<String> ArrayArchivos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the directory to search: ");
        String directory = scanner.nextLine();

        System.out.print("Enter the name of the file: ");
        String nameFile = scanner.nextLine();

        encontrarArchivo(new File(directory), nameFile);

        if (ArrayArchivos.isEmpty()) {
            System.out.println("File not found.");
        } else {
            System.out.println("File  found:");
            for (String fileName : ArrayArchivos) {
                System.out.println(fileName);
            }
        }
    }

    public static void encontrarArchivo(File directory, String nameFile) {
        File[] folders = directory.listFiles();

        if (folders != null) {
            for (File folder : folders) {
                if (folder.isDirectory()) {
                    encontrarArchivo(folder, nameFile);
                } else { 
                    if (folder.getName().equals(nameFile) || folder.getName().endsWith(".pnd") || folder.getName().endsWith(".docx") ) {
                        ArrayArchivos.add(folder.getAbsolutePath());
                    }
                }
            }
        }
    }
}
    	 
   
