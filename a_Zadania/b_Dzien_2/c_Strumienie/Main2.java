package a_Zadania.b_Dzien_2.c_Strumienie;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("arek", "nozwiak", 'm',
                LocalDate.parse("1983-12-18"), 1000));
        employees.add(new Employee("arek", "jozwiak", 'k',
                LocalDate.parse("1983-12-18"), 1000));
        employees.add(new Employee("arek", "jozwiak", 'k',
                LocalDate.parse("1990-12-18"), 2600));
        employees.add(new Employee("arek", "jozwiak", 'k',
                LocalDate.parse("2000-12-18"), 3600));

        employees.stream().filter(s -> s.getLastName().startsWith("n"))
                .forEach(s -> System.out.println(s));

        System.out.println("-------------------------");
        employees.stream().filter(e -> {
            long years = ChronoUnit.YEARS.between(e.getBirthday(), LocalDate.now());
            return years > 30 && years < 45;
        }).forEach(s -> System.out.println(s));

        System.out.println("-------------------------");
        employees.stream()
                .filter(e -> e.getSex() == 'k')
                .filter(e -> {
                    long years = ChronoUnit.YEARS.between(e.getBirthday(), LocalDate.now());
                    return years > 20 && years < 30;
                })
                .filter(e -> e.getSalary() <= 3500)
                .peek(e -> e.setSalary(e.getSalary() * 1.05))
                .forEach(s -> System.out.println(s));


    }
}
