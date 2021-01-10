package designPatterns.creational.abstractFactory;

import designPatterns.creational.factory.Computer;

public class TestFactory {

    public static void main(String[] args) {
        designPatterns.creational.abstractFactory.Computer pc= ComputerFactory.getComputer(new PCFactory("2GB", "500GB","2.4Ghz"));
        designPatterns.creational.abstractFactory.Computer server= ComputerFactory.getComputer(new ServerFactory("2GB", "500GB","2.4Ghz"));

        System.out.println(pc);
        System.out.println(server);
    }
}
