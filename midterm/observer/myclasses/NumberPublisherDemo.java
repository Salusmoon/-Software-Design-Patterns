package midterm.observer.myclasses;

public class NumberPublisherDemo  {

    public static void main(String[] args) throws InterruptedException {
        
        NumberPublisher publisher = new NumberPublisher();
        
        publisher.registerObservers(new BinaryView());
        publisher.registerObservers(new HexaDecimalView());
        publisher.registerObservers(new DecimalView());



        int publishCount = 5;

        for (int i =0; i<publishCount; i++){
            int number = i*20;
            System.out.println("\nPublishing:" + number);
            publisher.publishNumber(number);
            Thread.sleep(1000);
        }

    }

}
