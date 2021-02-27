package midterm.pattern1;

public class Airbag extends Decorator {

    public Airbag(Manufacturer manufacturer) {
        super(manufacturer);
        description = "Airbag";
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return 3000 + manufacturer.cost();
    }
    

    
}
