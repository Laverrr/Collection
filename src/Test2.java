import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {


    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(1,5,2,6,3,7));
        System.out.println(list);
        Integer[] integers = list.toArray(new Integer[list.size()]);
        System.out.println(integers);
        List<Integer> integerList = Arrays.asList(integers);
        System.out.println(integerList);
    }


}
