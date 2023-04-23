import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println(
                    Rabota.JamiRabota(Rabota.FileRabota())
            );
        }
        catch (InvalidNumberException e){
            System.out.println(e);
        }
    }
}

