package homework.employee;

import java.util.Scanner;


public class EmployeeDemo {
    public static Scanner scanner = new Scanner(System.in);
    public static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String s = scanner.nextLine();
            switch (s) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    searchEmByID();
                    break;
                case "4":
                    searchByCom();
                    break;
                case "5":
                    searchEmployeeWithMinSalary();
                    break;
                case "6":
                    deleteEmployeeByID();
                    break;

                default:
                    System.out.println("Command not found, please try again");
            }
        }


    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD EMPLOYEE");
        System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
        System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
        System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
        System.out.println("Please input 5 for SEARCH EMPLOYEES BY MINIMUM SALARY");
        System.out.println("Please input 6 for DELETE EMPLOYEE BY ID");
;
    }

    private static void addEmployee() {
        System.out.println("Please input name,surname,employeeID,salary,company,position (with ,)");
        String s = scanner.nextLine();
        String[] split = s.split(",");
        Employee employee = new Employee(split[0], split[1], split[2], new Scanner(split[3]).nextDouble(), split[4], split[5]);
        employeeStorage.add(employee);
        System.out.println("Employee added!");

    }

    private static void searchEmByID() {
        System.out.println("Please input employee ID");
        String searchId = scanner.nextLine();
        employeeStorage.searchByID(searchId);
    }

    private static void searchByCom() {
        System.out.println("Please input employee company");
        String serachCom = scanner.nextLine();
        employeeStorage.serachByCom(serachCom);
    }
    private static void deleteEmployeeByID() {
        System.out.println("Please input employee ID");
        String delByID= scanner.nextLine();
        employeeStorage.deleteById(delByID);
    }
    private  static  void searchEmployeeWithMinSalary(){
        System.out.println("Please input minimum salary");
        double minSalary = Double.parseDouble(scanner.nextLine());
        employeeStorage.searchByMinSalary(minSalary);

    }

}

