/**
 * Java1 HomeWork5
 * @author Лукьянова Елизавета
 * @version 19.10.2021
 */
//Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//Конструктор класса должен заполнять эти поля при создании объекта.
//Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//Создать массив из 5 сотрудников.

    class Lesson5 {

    public static void main (String[] args) {
        Employee [] employees = {
                new Employee("Sobakin Ivan", "Engineer", "sobakiniv@gmail.com", "891324567", 400000, 25),
                new Employee("Koshkina Anya", "Engineer", "koshkinany@gmail.com", "894354566", 45000, 55),
                new Employee("Volkov Sergey", "Support specialist", "volkovovo@gmail.com", "893875422", 25000, 21),
                new Employee("Mushkin Ivan", "Systems analyst", "sobakiniv@gmail.com", "897858412", 50000, 47),
                new Employee("Sobakin Ivan", "Engineer", "sobakiniv@gmail.com", "891324581", 38000, 26)
        };

        for (Employee employee: employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}

class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int wages;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int wages, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
  
    @Override
    public String toString() {
        return (fullName + " " + position + " " + email + " " + phone + " " + wages + " " + age);
    }
}
