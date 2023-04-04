package service.impl;

import classes.Student;
import enums.Gender;
import service.Service;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ServiceImpl implements Service {
    private List<Student>students = new ArrayList<>();

    @Override
    public String create(List<Student> students) {
            this.students.addAll(students);
            return null;
    }

    public void filter_A() {
        students.stream().filter(student -> student.getName().startsWith("A")).forEach(System.out::println);
    }

    public void filterAgeMoney() {
        students.stream().filter(x -> x.getAge() >= 15 & x.getPrice() >= 2000).forEach(System.out::println);
    }

    public void maxMoneyStudent() {
        students.stream().max(Comparator.comparing(Student::getPrice)).ifPresent(System.out::println);
    }

    public void filterMaxMoneyGirl() {
        System.out.println(students.stream().filter(x -> x.getGender().equals(Gender.F)).max(Comparator.comparing(Student::getPrice)));
    }

    public void filterName() {
        students.stream().map(Student::getName).forEach(System.out::println);
    }

    public void filterPrice() {
        students.stream().map(x -> x.getPrice() +1000).forEach(System.out::println);
    }

    public void filterName1() {
        System.out.println(students.stream().findFirst());
    }

    public long getAllStudent() {
        return students.size();
    }

    public Map<Gender, List<Student>> filterGroup() {
        List<Student>boys = students.stream().filter(s -> s.getGender().equals(Gender.M)).toList();
        List<Student> girls = students.stream().filter(s -> s.getGender().equals(Gender.F)).toList();
        System.out.println("boys\n"+boys);
        System.out.println("gris\n"+girls);
        return null;
    }
}
//students.stream().map(Student::getName).map(x -> x.getPrice() + 1000).forEach(System.out::println);