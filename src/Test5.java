import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {


    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("Alvin","Jack","Linken","Leo","Ngok","Boris"));
        System.out.println(        Collections.binarySearch(list,"Boris"));
        System.out.println(        Collections.binarySearch(list,"Leo"));
        String s=list.stream()
                .map(t->t+"t")
                .reduce("",(x,y)->{
                    if (Collections.binarySearch(list,y)==(list.size()-2)){
                        return x+y;
                    }else {
                        return x+y+",";
                    }
        }).toLowerCase();
        System.out.println(s);
//        System.out.println(list);
    }


}
