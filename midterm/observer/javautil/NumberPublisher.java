package midterm.observer.javautil;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


public class NumberPublisher extends Observable{

    private int num;

    List<Observer> observers = new ArrayList<>();

    public int getNum(){return num;}

    public void publishNumber(int num){
        this.num=num;
        setChanged();
        notifyObservers();
    }

}
