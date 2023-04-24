import java.io.*;

public class Example {




    public static void readAndReturnArray() throws IOException, InvalidNumberException {
        File file = new File("file.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader read = new BufferedReader(fileReader);
        int[] array = new int[10];
        String line = read.readLine();


        while (line != null) {
            int i = 0;
            array[i] = Integer.parseInt(line);
            if (array[i] < 0) {
                throw new InvalidNumberException("Chosen number is negative!");
            }
            System.out.println(array[i]);
            line = read.readLine();
        }
        read.close();

    }

        public int sumArray(int[] array) throws ArithmeticException {
            int sum = 0;
            for (int num : array) {
            try {
                sum += num;
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception occurred: " + e.getMessage());
            }
        }
        return sum;
    }
}


