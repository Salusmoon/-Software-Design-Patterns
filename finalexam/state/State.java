package finalexam.state;


public interface State {

    void insertCard(String card);
    void insertPin(String pin);
    void requestCash(int money);
    void ejectCard();

    
}
