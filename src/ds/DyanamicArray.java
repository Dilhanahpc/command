package ds;

public class DyanamicArray {
    private int[] numbers;

    public void add(int number){
        if(numbers==null){
            int[] temp=new int[1];
            temp[0]=number;
            numbers=temp;
        }else{
            int[] temp=new int[numbers.length+1];
            for(int i=0;i<numbers.length;i++){
                temp[i]=numbers[i];
            }
            temp[temp.length-1]=number;
            numbers=temp;
        }

    }
    public void add(int index,int number){

    }
    public void remove(int index){

    }
    public int get(int index){
        return 0;
    }
    public void print(){
        if(numbers==null){
            System.out.println("[]");
        }else{
            System.out.print("[");
            for(int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+" ,");
            }
            System.out.print("\b\b]");
        }
    }
    public void clear(){
        numbers=null;

    }
    public int size(){
        return 0;
    }
    public boolean contains(int number){
        return false;
    }
    public void empty(){

    }
}
