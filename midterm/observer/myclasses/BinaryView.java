package midterm.observer.myclasses;

public class BinaryView implements Observer{

    public void update(int num) {
        display(num);

    }

    public void display(int num){
        System.out.println(Integer.toBinaryString(num));
    }

}