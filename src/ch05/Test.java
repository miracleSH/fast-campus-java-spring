package ch05;

public class Test {
    public static void main(String[] args) {
        myLinkedListTest();
    }

    public static void myArrayTest(){
        MyArray myArray = new MyArray();
        for (int i = 0; i < 9; i++) {
            myArray.add(i);
        }
        myArray.insert(3, 52);

        myArray.remove(5);

        System.out.println(myArray);
    }

    public static void myLinkedListTest(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        myLinkedList.insert(1, 5);

        myLinkedList.remove(1);
        MyListNode temp = myLinkedList.getHead();
        while (temp.getNext() != null){
            System.out.println(temp);
            temp = temp.getNext();
        }
    }
}
