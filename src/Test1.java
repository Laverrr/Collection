import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {


    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(1,5,2,6,3,7));
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.emptyList();
    }


}
