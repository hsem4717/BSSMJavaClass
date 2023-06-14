package linkedList;

public interface List {
    Node add(String data);
    Node remove(int position);
    Node insert(String data, int position);
    void printAll();
    Node getElement(int position);
    int getSize();
    boolean isEmpty();
}
