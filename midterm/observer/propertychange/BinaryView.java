package midterm.observer.propertychange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class BinaryView implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt){
        NumberInfo publisher = (NumberInfo) evt.getNewValue();
        display(publisher.getNum());
    }
    

    public void display(int num){
        System.out.println(Integer.toBinaryString(num));
    }

}