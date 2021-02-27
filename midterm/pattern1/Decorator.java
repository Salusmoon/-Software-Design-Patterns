package midterm.pattern1;

public abstract class Decorator extends Manufacturer {

    protected Manufacturer manufacturer;

    public Decorator(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription(){return manufacturer.getDescription() + " +" + description;}
}
