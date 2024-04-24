package exceptionointro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Student {
    public int getScore() {
        System.out.println("Getting the score for the student");
        int score = 1 / 0;
        System.out.println("Score calculated");
        return score;
    }

    public void readFile() {
        try {
            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println("Trying to read file");
        } catch (FileNotFoundException ex) {
            System.out.println("Some error happened. File not found!!!");
        }

        System.out.println("Reading the file");
    }

    public void readFile2() throws FileNotFoundException {
        System.out.println("Trying to read file");
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);

        System.out.println("Reading the file");
        System.out.println("Bye");
    }

    public void test() {
        try {
            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println("Trying to read file");
        } catch (IOException ex) {
            System.out.println("Works!!!");
        }
    }

    public void testR() {
        try {
            if (true) {
                throw new SQLException();
            }

            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println("Trying to read file");
        } catch (FileNotFoundException ex) {
            System.out.println("file not found!!!");
        } catch (SQLException ex) {
            System.out.println("SQL exception occured");
        }

    }

    public void doSomething() {
        try {
            System.out.println("doing something");

            if (true) {
                throw new FileNotFoundException();
            }

            return;

        } catch (FileNotFoundException ex) {
            System.out.println("Some exception occurred!!!");
        }
        finally {  // -> Called no matter what even if there is a return
            // usually to do clean up activity
            System.out.println("Always called");
        }
    }
}
