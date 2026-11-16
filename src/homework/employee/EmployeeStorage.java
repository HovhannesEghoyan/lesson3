package homework.employee;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee em) {
        if (size == array.length) {
            extend();
        }
        array[size++] = em;
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

            System.out.print(array[i] + " ");

        }
    }


    public void searchByID(String ID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().equals(ID)) {
                System.out.println(array[i] + " ");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with this ID not found");
        }
    }

    public void addByID(String employeeID) {

        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().equals(employeeID))
                System.out.println("Employee with ID " + employeeID + " already exists.");
            return;
        }
    }

    public void addWithID(Employee ID) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().equals(ID.getEmployeeID())) {
                System.out.println("Employee with ID " + ID.getEmployeeID() + " already exists.");
                return;
            }
        }
        add(ID);
    }

    public void serachByCom(String company) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().equalsIgnoreCase(company)) {
                System.out.println(array[i] + " ");
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
        System.out.println("Employee deleted !");
    }
    public void searchByMinSalary(double minSalary){
        boolean found = false;
        for (int i = 0; i <size ; i++) {
            if (array[i].getSalary()>=minSalary){
                System.out.println(array[i]);
                found= true;
            }
        }
        if (!found){
            System.out.println("Employee with this minimum salary "+ minSalary+" not found");
        }

    }

}

