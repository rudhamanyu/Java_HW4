import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами.
//        Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
public class Task1 {
    public static void main(String[] args){
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList1.add(i);
        }
       invertedList(linkedList1);
    }
    public static void invertedList(LinkedList<Integer> lst){
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        while(lst.size()!=0)
            linkedList2.add(lst.removeLast());
        System.out.println(linkedList2);
    }
}
