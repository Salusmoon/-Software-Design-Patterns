package midterm.pattern1;

import java.util.ArrayList;
import java.util.List;

public class Sonda {
    
    public static void main(String[] args) {
        
        List<Manufacturer> cars = new ArrayList<>();
        cars.add(new Airbag(new Sity()));
        cars.add(new ABS(new Music_system(new Sivic())));
        cars.add(new Airbag(new ABS(new Sunroof(new Music_system(new Sity())))));
        cars.add(new Airbag(new ABS(new Sunroof(new Music_system(new Sivic())))));


        for(Manufacturer car : cars){
            System.out.println(car.getDescription() + " " + car.cost() + " TL");

        }
    
    }
}
