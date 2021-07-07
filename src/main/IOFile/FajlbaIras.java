package main.IOFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FajlbaIras {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("src\\source\\testFile.txt", true);

        fileWriter.write(" fürdik fekete tóban");
        fileWriter.write(" anyjához készül");
        fileWriter.write(" MORDORBA");

        fileWriter.flush();

        fileWriter.close();

    }

}
