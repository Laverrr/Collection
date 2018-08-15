import java.util.LinkedList;

public class Quene {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList();
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(9);
        linkedList.add(3);
        linkedList.add(6);
//        linkedList.remove(2);//del by index (index start with 0)
//        linkedList.poll();//del the first one
        linkedList.remove();//del the value of index 0
        Integer element = linkedList.element();
        System.out.println(element);//element peek get the value of index 0
        Integer peek = linkedList.peek();
        System.out.println(peek);
        Integer poll = linkedList.poll();//get the value of index 0 and del it from quene
        System.out.println(poll);
        System.out.println(linkedList);

//        for (Integer integer:linkedList){
//            System.out.println(linkedList.get(integer));
//        }
    }
}
