package finalexam.state;

public class ATMMachine {

    private static volatile ATMMachine instance;
    State HasCard;
    State HasCorrectPin;
    State NoCard;
    State OutOfMoney;

    State state;
    int money;

    String card;
    String pin;


    private ATMMachine(int money){
        this.money = money;
        HasCard = new HasCard(this);
        HasCorrectPin = new HasCorrectPin(this);
        NoCard = new NoCard(this);
        OutOfMoney = new OutOfMoney(this);
        if( money>0){
            state = NoCard;
        }
    }  


    // double-checked locking Singleton
    public static ATMMachine getInstance(int money) {
        if (instance == null) {
            synchronized (ATMMachine.class) {
                if (instance == null) {
                    instance = new ATMMachine(money);
                }
            }
        }
        return instance;
    }

    public void insertCard(String card){
        state.insertCard(card);
    }

    public void ejectCard(){
        state.ejectCard();
    }

    public void requestCash(int cash){
        state.requestCash(cash);
    }

    public void insertPin(String pin){
        state.insertPin(pin);
    }

    public void setState(State state){
        this.state = state;
    }
    
    public int getMoney(){
        return this.money;
    }



}
