import java.io.*;

public class IOTest2 {
    public static void main(String[] args) throws IOException {

        String str="aa";

        File file=new File("C:\\Users\\z.cai\\readme.txt");

        if (!file.exists()){
            file.mkdir();
        }
        FileOutputStream fileWriter=new FileOutputStream(file,true);
        OutputStreamWriter writer=new OutputStreamWriter(fileWriter);
        try {
            writer.write("HHHHhhh");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.close();

        }


    }
}
