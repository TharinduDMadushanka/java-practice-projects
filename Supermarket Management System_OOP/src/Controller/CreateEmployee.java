package Controller;

import Model.Employee;

public class CreateEmployee {
    public CreateEmployee(Employee e){
        String insert=e.getFirstName()+" "+e.getLastName()+" "+e.getEmail()+" "+e.getPhoneNumber()+" "+
                      e.getAddress()+" "+e.getSalary();
    }
}
