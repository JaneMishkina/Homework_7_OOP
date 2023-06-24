

import java.util.Random;

public class Programmist extends Employee implements Observer {

    private static Random random = new Random();

    public Programmist(String name, Profession profession) {
        super(name, profession);
        minSalary = random.nextDouble(80000, 110000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Profession vacancyProfession) {
        super.receiveOffer(nameCompany, salary, vacancyProfession);
    }
}