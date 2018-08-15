import java.util.*;
import java.util.stream.Collectors;

public class Test3 {


    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(1,5,2,6,3,7));
        list.stream().filter(t -> t > 5).collect(Collectors.toList());
//        List<Integer> collect = list.stream().filter(t ->
//                t%2!=0 ).map(t->t*10).collect(Collectors.toList());
        List<Integer> collect = list.stream().map(t->t*10).filter(t ->
                t< 70).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        Collections.reverse(collect);
        System.out.println(collect);
        Integer min = list.stream().min(Integer::compareTo).get();
        Integer max = list.stream().max(Integer::compareTo).get();
        System.out.println(max);
        System.out.println(min);
//        list.stream().forEach(t-> System.out.print(t));
//        list.stream().forEach(System.out::print);
        long count = list.stream().count();
        System.out.println("count: "+count);
        List<Integer> collectLimit = list.stream().limit(3).sorted().collect(Collectors.toList());
        System.out.println(collectLimit);
        list.stream().forEach(t-> {
            t=t*10;
            System.out.print(t+" ");
        });

    }


}
