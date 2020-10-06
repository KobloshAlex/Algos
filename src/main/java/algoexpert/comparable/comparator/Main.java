package algoexpert.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(3, "Rick"));
    employees.add(new Employee(1, "Alex"));
    employees.add(new Employee(2, "Ron"));

    Comparator<Employee> comparator =
        (emp1, emp2) -> {
          if (emp1.getId() > emp2.getId()) {
            return 1;
          }
          if (emp1.getId() < emp2.getId()) {
            return -1;
          } else {
            return 0;
          }
        };

    Collections.sort(employees, comparator);
    for (Employee employee : employees) {
      System.out.println(employee);
    }
  }
}
