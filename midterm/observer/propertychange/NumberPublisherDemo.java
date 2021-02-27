package midterm.observer.propertychange;

public class NumberPublisherDemo  {

    public static void main(String[] args) throws InterruptedException {
        
        NumberPublisher publisher = new NumberPublisher();
        
        publisher.addObserver(new BinaryView());
        publisher.addObserver(new HexaDecimalView());
        publisher.addObserver(new DecimalView());



        int publishCount = 5;

        for (int i =0; i<publishCount; i++){
            int number = i*20;
            System.out.println("\nPublishing:" + number);
            publisher.publishNumber(number);
            Thread.sleep(1000);
        }

    }

}
