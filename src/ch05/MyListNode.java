package ch05;

public class MyListNode {
    private int data;
    private MyListNode next;

    public MyListNode(){
        this.data = 0;
        this.next = null;
    }

    public MyListNode(int data, MyListNode next){
        this.data = data;
        this.next = next;
    }

    public MyListNode getNext() {
        return next;
    }

    public void setNext(MyListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "MyListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
