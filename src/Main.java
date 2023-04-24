import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            Example example = new Example();
            example.readAndReturnArray();

        } catch (IOException | InvalidNumberException e){
            e.printStackTrace();
        }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Example example = new Example();
        System.out.println("The sum of the numbers is " + example.sumArray(array));



    }
}