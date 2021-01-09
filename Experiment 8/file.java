import java.io.*;


public class file {
    public static void main(String[] args) {
        System.out.println("Kapil Bansal 01820902718");
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("File Handling");
            bufferedWriter.newLine();
            bufferedWriter.write("Good Bye");
            bufferedWriter.close();
            FileReader reader = new FileReader("MyFile.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
