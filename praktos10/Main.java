package praktos10;

import java.io.*;
import java.util.Arrays;

//Вариант 2
//        В исходном файле содержится две строки в формате UTF-8 и 5 чисел типа
//        double. В результирующий файл переписать вторую строку и положительные
//        числа.
public class Main {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/praktos10/file.txt"));
            String firstLine = reader.readLine();
            String secondLine = reader.readLine();
            double[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            reader.close();

            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/praktos10/output.txt"));
            dataOutputStream.writeUTF(secondLine + "\n");
            for (double num: numbers) {
                if(num >= 0)
                    dataOutputStream.writeDouble(num);
            }
            dataOutputStream.flush();
            dataOutputStream.close();

            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/praktos10/output.txt"));
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readDouble());
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
//            writer.write(secondLine + "\n");
//            for (String number : numbers) {
//                double doubleNumber = Double.parseDouble(number);
//                if (doubleNumber >= 0) {
//                    writer.write(doubleNumber + " ");
//                }
//            }

//            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
