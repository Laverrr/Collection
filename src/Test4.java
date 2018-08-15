import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {


    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("Alvin","Jack","Linken","Leo","Ngok","Boris"));
        list=list.stream().filter(t ->!t.startsWith("B")).
                map(t-> t=t+"T").
                map(t->t.toUpperCase()).
                sorted().limit(4).
                collect(Collectors.toList());
        System.out.println(list);
    }


}
