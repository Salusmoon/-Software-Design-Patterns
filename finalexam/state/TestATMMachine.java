package finalexam.state;

public class TestATMMachine {
    public static void main(String... args){
        //Create machine and set the current amount of money in the machine
        ATMMachine machine = ATMMachine.getInstance(25000);

        machine.insertCard("cardnumber");
        machine.insertPin("pin");
        machine.requestCash(3000);
        machine.ejectCard();

        machine.insertCard("cardnumber2");
        machine.insertPin("pin2");
        machine.requestCash(5000);
        machine.requestCash(2000);
        machine.ejectCard();

    }
}
