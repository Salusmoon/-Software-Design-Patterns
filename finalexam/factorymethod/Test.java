package finalexam.factorymethod;


public class Test {

    public static void main(String... args){

        NYPizzaStore nps = new NYPizzaStore();

        nps.orderPizza("cheese");


        ChicagoPizzaStore cps = new ChicagoPizzaStore();

        cps.orderPizza("cheese");
    }
}