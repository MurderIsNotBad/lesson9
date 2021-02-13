import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Сlass9-PC10\\Desktop\\reader.txt"));

            String firstString = reader.readLine();
            System.out.println(firstString);
        }catch (FileNotFoundException e){
            System.out.println("File not found");;
        }catch (IOException ioException){
            ioException.printStackTrace();
        }finally {
            if(reader != null){
                reader.close();
            }
        }

    }
}
