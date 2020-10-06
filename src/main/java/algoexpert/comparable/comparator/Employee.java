package algoexpert.comparable.comparator;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
  private int id;
  private String name;

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public Employee setId(int id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Employee setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Employee)) {
      return false;
    }
    Employee employee = (Employee) o;
    return id == employee.id && Objects.equals(name, employee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
  }

  @Override
  public int compareTo(Employee employee) {
    if (this.id > employee.getId()) {
      return 1;
    } else if (this.id < employee.getId()) {
      return -1;
    } else {
      return 0;
    }
  }
}
