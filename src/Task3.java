import java.util.LinkedList;

//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class Task3 {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        int res = sumElemsList(linkedList);
        System.out.println(res);
    }
    public static int sumElemsList(LinkedList<Integer> lst){
        int sum = 0;
        for (Integer item : lst) {
            sum += item;
        }
        return sum;
    }
}
