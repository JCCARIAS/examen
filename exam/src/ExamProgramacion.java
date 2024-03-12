
import java.io.File;
import java.util.Scanner;

public class ExamProgramacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory to search: ");
        String directory = scanner.nextLine();

        encontrarDirectorio(new File(directory));
    }

    public static void encontrarDirectorio(File directory) {
        if (directory.isDirectory()) {
            System.out.println("Directorio: " + directory.getName());

            File[] archivos = directory.listFiles();

            if (archivos != null) {
                for (File archivo : archivos) {
                    encontrarDirectorio(archivo);
                }
            }
        }
    }
}