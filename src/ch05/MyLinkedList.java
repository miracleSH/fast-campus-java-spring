package ch05;

public class MyLinkedList {
    private int count;
    private MyListNode head;

    public MyLinkedList(){
        count = 0;
        head = null;
    }

    public int getCount() {
        return count;
    }

    public MyListNode getHead() {
        return head;
    }

    public MyListNode add(int data){
        MyListNode node;
        if(head == null){
            node = new MyListNode(data, null);
            head = node;
        }else{
            MyListNode temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            node = new MyListNode(data, null);
            temp.setNext(node);
        }
        count++;
        return node;
    }

    public void insert(int position, int data){
        if(position > count - 1 || position < 0){
            System.out.println("out of index");
            return;
        }

        if(position == 0){
            MyListNode newNode = new MyListNode(data, null);
            head.setNext(newNode);
            head = newNode;
        }

        MyListNode head = this.head;
        for(int i = 0; i < count; i++){
            if(i == position){
                MyListNode insertedNode = new MyListNode(data, head.getNext());
                head.setNext(insertedNode);
            }else{
                head = head.getNext();
            }
        }
    }

    public MyListNode remove(int position){
        if(position < 0 || position > count){
            System.out.println("Out Of Bound");
            return null;
        }
        MyListNode deletedNode;
        if(position == 0){
            deletedNode = this.head;
            this.head = head.getNext();
        }else{
            MyListNode temp = head;
            for(int i = 0; i < position; i++){
                temp = temp.getNext();
            }
            deletedNode = temp.getNext();
            temp.setNext(deletedNode.getNext());
        }
        count--;
        return deletedNode;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "count=" + count +
                ", head=" + head +
                '}';
    }
}
