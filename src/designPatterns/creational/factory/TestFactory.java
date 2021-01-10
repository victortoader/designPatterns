package designPatterns.creational.factory;

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2GB", "500GB","2.4Ghz");
        Computer server = ComputerFactory.getComputer("server", "12GB", "5000GB","5.4Ghz");
        System.out.println(pc);
        System.out.println(server);
    }
}
