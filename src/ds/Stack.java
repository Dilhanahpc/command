package ds;

import java.util.Arrays;

public class Stack {

    private int[] numbers;


    public void push(int num){
        if (numbers ==null){
            numbers=new int[1];
            numbers[0]=num;
        }else{
            int[] temp=new int[numbers.length+1];
            for (int i=0;i<numbers.length;i++){
                temp[i]=numbers[i];
            }
            temp[temp.length-1]=num;
            numbers=temp;

        }

    }
    public void pop(){
        System.out.println();
        if (numbers==null){
            System.out.print("cannot pop from empty array");
            return;
        }else if(numbers.length==1){
            numbers=null;
            return;
        }

        int[] temp= new int[numbers.length-1];
        for (int i=0;i<numbers.length-1;i++){
            temp[i]=numbers[i];
        }
        numbers=temp;


    }
    public boolean empty(){
        return numbers==null;
    }
    public int size(){
        return numbers==null?0:numbers.length;
    }
    public int peek(){
        if (empty()){
            System.out.println("Empty array does not return value");
        }
            return numbers[numbers.length-1];


    }
    public void clear(){
        numbers=null;

    }
    public void print(){
        if (empty()){
            System.out.print("[]");
            return;
        }
        System.out.print("[");
        for (int i = numbers.length-1;i>=0;i--){
            System.out.print(numbers[i] +", ");
        }
        System.out.print("\b\b]");

    }
    public boolean contains(int number){
        if (empty()){
            return false;
        }
        for(int i =0 ;i<numbers.length-1;i++){
            if (numbers[i]==number){
                return true;
            }
        }
        return false;

    }
}
