package finalexam.factorymethod;

public class ChicagoPizzaStore extends PizzaStore{
    

    public void scheduleDelivery(){
        System.out.println("delivery is schedule");
    }


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if (type.equals("veggi")) {
            pizza = new ChicagoStyleVeggiePizza();
        }else{
            return null;
        }
        return pizza;
    }
}
