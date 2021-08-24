
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Person anna = new Person("Anna", Education.PHD);
        Person dan = new Person("Dan", Education.MA);
        Person joe = new Person("Joe", Education.PHD);
        Employees employees = new Employees();
        employees.add(anna);
        employees.add(dan);
        employees.add(joe);
        employees.fire(Education.MA);
        employees.print();
    }
}
