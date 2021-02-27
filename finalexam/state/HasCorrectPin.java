package finalexam.state;

public class HasCorrectPin implements State{

    ATMMachine atm;


    public HasCorrectPin(ATMMachine atmMachine) {
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
        System.out.println("Pin already entered");
        
    }
    
    @Override
    public void requestCash(int money) {
        if(atm.money>= money){
            atm.money = atm.money-money;
            System.out.println("Money taken");

        }else{
            System.out.println("Out of money");
            atm.setState(atm.OutOfMoney);
        }
        
        
    }


}
