package main;

import exception.MyException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClass {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("file");
            BufferedReader bReader = new BufferedReader(reader);
            String line = bReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bReader.readLine();

            }
        }
        catch (MyException e) {
            // code
        }
        catch (FileNotFoundException e) {
            // code
        }
        catch (IOException e) {
            // code
        }
        catch (IllegalArgumentException e) {
            // code
        }
        catch (OutOfMemoryError e) {
            // code
        }



    }
}
