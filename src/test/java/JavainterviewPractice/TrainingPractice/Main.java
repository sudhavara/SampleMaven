package JavainterviewPractice.TrainingPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    private List<Employee> emplist = new ArrayList<>();

    private void addEmployee(Employee emp){
        emplist.add(emp);
    }

    private void removeEmployeeById(int id){
        Iterator<Employee> it = emplist.iterator();
        while(it.hasNext()) {
            Employee employee = it.next();
            System.out.println("next value in iterator is "+employee.getId());
            if (employee.getId()==id) {
                System.out.println("entered in to match block");
                it.remove();

            }
        }

        showEmployeeList();

    }

    private void showEmployeeList(){

        for(Employee employee:emplist){
            System.out.println(employee.getId() + "  "+ employee.getName()+"  "+employee.getSalary());
        }
    }

    private void searchEmployeeByName(String name){

        for(Employee employee:emplist){
            if(employee.getName().equals(name)) {
                System.out.println(employee.getId() +"  "+ employee.getSalary());
                System.out.println("employee information for "+employee.getName());
            }
        }
    }

    private void removeAllEmployeeFromList(List<Employee> employeeList){}



    public static void main(String[] args){

        Main main= new Main();

        Employee employee1 =new Employee("Sudha",1000,1);
        Employee employee2 =new Employee("Venkat",1001,2);
        Employee employee3 =new Employee("Shashank",1002,3);
        Employee employee4 =new Employee("Srivatsa",1003,4);
        Employee employee5 =new Employee("Daddy",1004,5);
        Employee employee6 =new Employee("Mommy",1005,6);

        main.addEmployee(employee1);
        main.addEmployee(employee2);
        main.addEmployee(employee3);
        main.addEmployee(employee4);
        main.addEmployee(employee5);
        main.addEmployee(employee6);

        main.showEmployeeList();

        //remove

        main.removeEmployeeById(1);

        main.searchEmployeeByName("Shashank");
        main.searchEmployeeByName("Srivatsa");



    }






}
