package finalexam.state;

public class OutOfMoney implements State{

    ATMMachine atm;
    

    public OutOfMoney(ATMMachine atmMachine) {
        atm= atmMachine;
	}

	@Override
    public void ejectCard() {
        atm.setState(atm.NoCard);
        System.out.println("Card ejected");
        
    }

    @Override
    public void insertCard(String card) {
        System.out.println("Card already inserted");
        
    }

    @Override
    public void insertPin(String pin) {
        System.out.println("Pin already entered");
        
    }
    
    @Override
    public void requestCash(int money) {
        System.out.println("withdrawals can not be made");
        
    }


}
