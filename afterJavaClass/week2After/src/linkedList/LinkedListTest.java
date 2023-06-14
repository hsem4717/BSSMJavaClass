package linkedList;
public class LinkedListTest {
    public static void main(String[] args) {
        // 1.linkedList 생성
        LinkedList list = new LinkedList();
        // 2.생성된 list에 값 추가
        list.add("A");
        list.add("B");
        list.add("C");
        // 3.list의 값 출력
        list.printAll();
        // 4.insert
        list.insert("D", 1);
        list.printAll();
        // 5.remove
        list.remove(2);
        list.printAll();
        // 6.getElement
        System.out.println(list.getElement(0).getData());
        System.out.println(list.isEmpty());

    }
}
