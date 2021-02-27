package midterm.observer.myclasses;

public class HexaDecimalView implements Observer{
    public void update(int num) {
        display(num);

    }

    public void display(int num){
        System.out.println(Integer.toHexString(num));
    }
}