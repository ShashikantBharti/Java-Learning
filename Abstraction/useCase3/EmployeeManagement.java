abstract class Employee {
  String name;
  int id;

  Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }

  abstract double calculatePay();
}

class FullTimeEmployee extends Employee {
  double salary;

  FullTimeEmployee(String name, int id, double salary){
    super(name, id);
    this.salary = salary;
  }

  @Override
  double calculatePay() {
    return salary;
  }

}

class PartTimeEmployee extends Employee {
  double hourlyRate;
  int hoursWorked;

  PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
    super(name, id);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  @Override
  double calculatePay() {
    return hourlyRate * hoursWorked;
  }

}

class Main {
  public static void main(String[] args) {
    Employee employee = new FullTimeEmployee("John Doe", 102, 12000);
    System.out.println(employee.name + "'s Salary is: " + employee.calculatePay());

    employee = new PartTimeEmployee("Ravi Shukla", 202, 500, 150);
    System.out.println(employee.name + "'s Salary is: " + employee.calculatePay());
  }
}