package main.IOFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FajlbolOlvasas {


    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src\\source\\testFile.txt");

        String fajlSzoveg="";

        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()){
            fajlSzoveg += fileScanner.nextLine() + "\n";
        }

        System.out.println(fajlSzoveg);

    }

}
