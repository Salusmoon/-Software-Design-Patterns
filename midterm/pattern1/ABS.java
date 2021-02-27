package midterm.pattern1;

public class ABS extends Decorator {

    public ABS(Manufacturer manufacturer) {
        super(manufacturer);
        description = "ABS";
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return 5000 + manufacturer.cost();
    }

    
}
