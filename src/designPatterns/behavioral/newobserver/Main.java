package designPatterns.behavioral.newobserver;

public class Main {


    public static void main (String[] args)
    {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setGoogPrice(154.4);
        stockGrabber.setAapPrice(200);
        stockGrabber.setIbmPrice(500);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);

        // Call for the code in run to execute

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();



    }



}
