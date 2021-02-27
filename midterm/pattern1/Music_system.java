package midterm.pattern1;

public class Music_system extends Decorator {

    public Music_system(Manufacturer manufacturer) {
        super(manufacturer);
        description = "Music System";
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return 1000 + manufacturer.cost();
    }
}
