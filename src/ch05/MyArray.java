package ch05;

import java.util.Arrays;

public class MyArray {
    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray(){
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size){
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }

    public void add(int num){
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
        }else{
            intArr[count++] = num;
        }
    }

    public void insert(int index, int num){
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
        }else{
            for (int i = count; i > index; i--){
                intArr[i] = intArr[i - 1];
            }
            intArr[index] = num;
            count++;
        }
    }

    public int remove(int index){
        int res;
        if(isEmpty()){
            res = ERROR_NUM;
            return res;
        }
        if(index < 0){
            res = ERROR_NUM;
            return res;
        }

        res = intArr[index];

        // index 오른쪽부터 왼쪽으로 한칸씩 밀기
        for(int i = index; i < count - 1; i++) {
            intArr[i] = intArr[i + 1];
            intArr[i+1] = 0; //이동한 값은 0으로 초기화
        }
        count--;
        return res;
    }

    private boolean isEmpty() {
        if(count == 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "intArr=" + Arrays.toString(intArr) +
                ", count=" + count +
                ", ARRAY_SIZE=" + ARRAY_SIZE +
                '}';
    }
}
