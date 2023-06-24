
import java.util.Random;

public abstract class Employee {
    protected static Random random = new Random();

    protected String name;
    protected double minSalary;
    protected Profession profession;

    public Employee(String name, Profession profession) {
        this.name = name;
        minSalary = random.nextDouble(80000, 100000);
        this.profession = profession;
    }

    public void receiveOffer(String nameCompany, double salary, Profession vacancyProfession) {
        if (vacancyProfession.equals(profession)) {
            if (minSalary <= salary) {
                System.out.printf("%s (%.2f) >>> Мне нужна эта работа! (%s - %f)\n", 
                        name, minSalary, nameCompany, salary);
                minSalary = salary;
            } else {
                System.out.printf("%s (%.2f) >>> Я найду работу получше! (%s - %f)\n",
                        name, minSalary, nameCompany, salary);
            }
        } else {
            System.out.printf("%s не хочет вакансию %s, потому что он(а) - %s\n", name, vacancyProfession.toString(), profession.toString());
        }
    }

}