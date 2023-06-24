
public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();


        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov", Profession.ProjectManager);
        Master petrov = new Master("Petrov", Profession.WebDesigner);
        Student sidorov = new Student("Sidorov", Profession.Tester);
        Programmist mishkina = new Programmist("Mishkina", Profession.Programmist);
        Programmist lyadova = new Programmist("Lyadova", Profession.Analyst);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(lyadova);
        jobAgency.registerObserver(mishkina);

        for (int i = 0; i < 4; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}
