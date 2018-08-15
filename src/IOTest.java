import java.io.*;
import java.util.Properties;

public class IOTest {
    public static void main(String[] args) {

        File file=new File("C:\\Users\\z.cai\\readme.txt");

        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String str=bufferedReader.readLine();

            while (str!=null){
                System.out.println(str);
                str=bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
