package ds;

public class Queue {

    private int[] numbers;

    public void enqueue(int num){
        if (numbers==null){
            int[] temp=new int[1];
            temp[0]=num;
            numbers=temp;
        }else{
            int[] temp =new int[numbers.length+1];
            for(int i=0;i<numbers.length;i++){
                temp[i]=numbers[i];
            }
            temp[temp.length-1]=num;
            numbers=temp;
        }


    }
    public void dequeue(){
        if (empty()){
            System.out.println("cannot dequeue from empty array");
            return;

        }else if(numbers.length==1){
            numbers=null;
            return;
        }else{
            int[] temp=new int[numbers.length-1];
            for(int i=1;i< numbers.length;i++){
                temp[i-1]=numbers[i];
            }
            numbers=temp;

        }

    }
    public boolean empty(){
        return numbers==null;

    }
    public int peek(){
       return numbers==null?-1:numbers[0];
    }
    public void clear(){
        numbers=null;

    }
    public void print(){
        System.out.println();
        if(empty()){
            System.out.println("[]");
        }else{
            System.out.print("[");
            for(int i=numbers.length-1;i>=0;i--){
                System.out.print(numbers[i]+" ,");
            }
            System.out.print("\b\b]");
        }


    }
    public boolean contains(int num){
        return false;

    }
    public int size(){
        return numbers==null?0: numbers.length;

    }

}
