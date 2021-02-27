package midterm.observer.javautil;

import java.util.Observable;
import java.util.Observer;

public class DecimalView implements Observer{
    
    @Override
    public void update(Observable o, Object arg) {
        NumberPublisher publisher = (NumberPublisher) o;
        display(publisher.getNum());
    }

    public void display(int num){
        System.out.println(num);
    }
}