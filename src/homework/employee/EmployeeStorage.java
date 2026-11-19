package homework.employee;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;

    public void addEmployee(Employee employee) {
        if (getById(employee.getEmployeeID()) != null) {
            System.out.println("Employee with this ID already exists!");
            return;
        }
        if (size == array.length) {
            extend();
        }
        array[size++] = employee;
        System.out.println("Employee added!");
    }

    private void extend() {
        Employee[] tmp = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void print() {
        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public Employee getById(String id) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().equals(id)) {
                return array[i];
            }
        }
        return null;
    }

    public void searchByID(String id) {
        Employee employee = getById(id);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee with this ID not found");
        }
    }

    public void changeEmployeeCompany(String employeeId, Company newCompany) {
        Employee employee = getById(employeeId);
        if (employee == null) {
            System.out.println("Employee with ID " + employeeId + " not found!");
            return;
        }
        employee.setCompany(newCompany);
        System.out.println("Employee's company changed");
    }

    public void printEmployeeCompany(String employeeId) {
        Employee employee = getById(employeeId);
        if (employee == null) {
            System.out.println("Employee with ID " + employeeId + " not found!");
            return;
        }
        if (employee.getCompany() == null) {
            System.out.println("This employee does not have a company");
        } else {
            System.out.println(employee.getCompany());
        }
    }

    public void serachByCom(String companyName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getCompany() != null && array[i].getCompany().getName().equals(companyName)) {
                System.out.println(array[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with this company not found");
        }
    }

    public void deleteById(String id) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Employee with ID " + id + " not found.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        System.out.println("Employee deleted!");
    }

    public void searchByMinSalary(double minSalary) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getSalary() >= minSalary) {
                System.out.println(array[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with this minimum salary " + minSalary + " not found");
        }
    }

    public void printByIdEmpl(String companyId) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getCompany() != null && array[i].getCompany().getCompanyID().equals(companyId)) {
                System.out.println(array[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is no employee in this company");
        }
    }

}
