package finalexam.state;

public class HasCard implements State{
    
    ATMMachine atm;


    public HasCard(ATMMachine atmMachine) {
        atm = atmMachine;
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

        atm.setState(atm.HasCorrectPin);
        atm.pin = pin;
        System.out.println("Correct Pin");
    }

    @Override
    public void requestCash(int money) {
        System.out.println("withdrawals can not be made");
        
    }
}
