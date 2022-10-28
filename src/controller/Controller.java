package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Controller {

    public FileWriter criaFile() throws IOException {
        FileWriter file = new FileWriter("C:\\TEMP\\cadastro.csv");
        return file;
    }  
}
