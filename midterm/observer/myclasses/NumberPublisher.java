package midterm.observer.myclasses;

import java.util.ArrayList;
import java.util.List;


public class NumberPublisher implements Subject{

    private int num;

    List<Observer> observers = new ArrayList<>();

    public int getNum(){return num;}

    public void publishNumber(int num){
        this.num=num;
        notifyObservers();
    }
    
    @Override
    public void registerObservers(Observer observer){
        observers.add(observer);

    }
    
    @Override
    public void removeObservers(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer:observers){
            observer.update(num);
        }
    }
}
