import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rabota {
    private Rabota() throws InvalidNumberException {
        int[] array = FileRabota();
    }
    public static int[] FileRabota() throws InvalidNumberException {
        int[] array = new int[10];
        try {
            File file = new File("F:\\Desktop\\mjava\\davaleba2\\src\\text.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                for(int i=0; i<10; i++){
                    int number = scanner.nextInt();
                    if (number < 0) {
                        throw new InvalidNumberException("Negative number not allowed");
                    }
                    array[i] = number;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        return array;
    }

    public static int JamiRabota(int[] array){
        int summary = 0;
        for (int i : array) {
            summary += i;
        }
        return summary;
    }
}