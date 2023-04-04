import classes.Student;
import enums.Gender;
import service.impl.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        List<Student>students1 = new ArrayList<>();
        students1.add(new Student("Kanykei",16, Gender.F,12354,"Akjoltoi kyzy"));
        students1.add(new Student("Adil",18,Gender.M,765,"Aitbaev"));
        students1.add( new Student("Erlan",21,Gender.M,4562,"Buzurmanaliev"));
        students1.add(new Student("Aigerim",17,Gender.F,2345,"Bektenova"));
        students1.add(new Student("Madina",16,Gender.F,342,"Halikova"));



        service.create(students1);
        System.out.println("аты А менен башталган студенттерди чыгарат.");
        System.out.println("=========================================");
        service.filter_A();
        System.out.println("=========================================");
        System.out.println("жашы 15тен чон жана акчасы 2000 ден чон студентти чыгарат.");
        System.out.println("=========================================");
        service.filterAgeMoney();
        System.out.println("=========================================");
        System.out.println("эн коп акчасы бар студентти чыгарат.");
        System.out.println("=========================================");
        service.maxMoneyStudent();
        System.out.println("=========================================");
        System.out.println("эн акчасы коп кызды чыгарат.");
        System.out.println("=========================================");
        service.filterMaxMoneyGirl();
        System.out.println("=========================================");
        System.out.println("баардык студенттердин атын эле консолго чыгарат.");
        System.out.println("=========================================");
        service.filterName();
        System.out.println("=========================================");
        System.out.println("баардык студенттердин акчасына 1000 сомдон кошуп чыгарат.");
        System.out.println("=========================================");
        service.filterPrice();
        System.out.println("=========================================");
        System.out.println("биринчи турган студентти чыгарат.");
        System.out.println("=========================================");
        service.filterName1();
        System.out.println("=========================================");
        System.out.println("канча студент бар экендигин чыгарат.");
        System.out.println("=========================================");
        System.out.println(service.getAllStudent());
        System.out.println("=========================================");
        System.out.println("балдарды жана кыздарды группага салат.");
        System.out.println("=========================================");
        System.out.println(service.filterGroup());

    }
}