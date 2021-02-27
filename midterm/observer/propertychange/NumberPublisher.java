package midterm.observer.propertychange;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;


public class NumberPublisher {

    NumberInfo info = new NumberInfo();

    PropertyChangeSupport support;

    public NumberPublisher() {
        support = new PropertyChangeSupport(this);
    }

    public void addObserver(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public int getNum(){return info.getNum();}

    public void publishNumber(int num){
        info.setNum(num);
        support.firePropertyChange("number", null, info);
        
    }

    

}
