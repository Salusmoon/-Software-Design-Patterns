package finalexam.state;

public class NoCard implements State{
    
    ATMMachine atm;


    public NoCard(ATMMachine atmMachine) {
        atm = atmMachine;
	}

	@Override
    public void ejectCard() {
        System.out.println("No Card found");
        
    }

    @Override
    public void insertCard(String card) {
        atm.card = card;
        atm.setState(atm.HasCard);
        System.out.println("Card entered");
        
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
