import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringTest {


    public static void main(String[] args) {
        String str= "123abc456qwer999xyz";
        Pattern compile = Pattern.compile("\\d+");
        Matcher matcher=compile.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
