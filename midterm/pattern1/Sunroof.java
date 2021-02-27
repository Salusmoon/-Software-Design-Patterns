package midterm.pattern1;

public class Sunroof extends Decorator {

    public Sunroof(Manufacturer manufacturer) {
        super(manufacturer);
        description = "Sunroof";
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return 2000 + manufacturer.cost();
    }
}
