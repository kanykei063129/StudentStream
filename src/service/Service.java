package service;

import classes.Student;
import enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface Service {

    public String create(List<Student> students);
    public void filter_A();
    public void filterAgeMoney();
    public void maxMoneyStudent();
    public void filterMaxMoneyGirl();
    public void filterName();
    public void filterPrice();
    public void filterName1();
    public long getAllStudent();
    public Map<Gender, List<Student>> filterGroup();
}
