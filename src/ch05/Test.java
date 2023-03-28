package ch05;

public class Test {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        for (int i = 0; i < 9; i++) {
            myArray.add(i);
        }
        myArray.insert(3, 52);

        myArray.remove(5);

        System.out.println(myArray);
    }
}
