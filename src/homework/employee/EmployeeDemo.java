package homework.employee;

import java.util.Scanner;


public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

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
                case "7":
                    addCompany();
                    break;
                case "8":
                    companyStorage.print();
                    break;
                case "9":
                    searchComById();
                    break;
                case "10":
                    printByIdEmpl();
                    break;
                case "11":
                    changeEmployeeCompany();
                    break;
                case "12":
                    printEmployeeCompany();
                    break;
                default:
                    System.out.println("Command not found, please try again");
            }
        }


    }

    private static void printByIdEmpl() {
        System.out.println("Please input ID of company");
        String printByID = scanner.nextLine();
        if (companyStorage.getById(printByID) != null) {
            employeeStorage.printByIdEmpl(printByID);
        }else System.out.println("Company with this ID does not exists");
    }


    private static void addCompany() {
        System.out.println("Please input companyId,name,industry,country");
        String addCom = scanner.nextLine();
        String[] addComsplit = addCom.split(",");
        Company company = new Company(addComsplit[0], addComsplit[1], addComsplit[2], addComsplit[3]);
        companyStorage.addCompany(company);

    }

    private static void searchComById() {
        System.out.println("Please input ID of company");
        String ByIDSearch = scanner.nextLine();
        companyStorage.getById(ByIDSearch);
        if (companyStorage.getById(ByIDSearch) != null){
            System.out.println(companyStorage.getById(ByIDSearch));
        }else System.out.println("Company with this ID not found");

    }
    private static void changeEmployeeCompany() {
        System.out.println("Please input employee ID");
        String employeeId = scanner.nextLine();
        System.out.println("Please input new company ID");
        String newCompanyId = scanner.nextLine();

        Company newCompany = companyStorage.getById(newCompanyId);
        if (newCompany == null) {
            System.out.println("Company not found!");
            return;
        }
        employeeStorage.changeEmployeeCompany(employeeId, newCompany);
    }
    private static void printEmployeeCompany() {
        System.out.println("Please input employee ID");
        String employeeId = scanner.nextLine();
        employeeStorage.printEmployeeCompany(employeeId);
    }
    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD EMPLOYEE");
        System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
        System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
        System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");
        System.out.println("Please input 5 for SEARCH EMPLOYEES BY MINIMUM SALARY");
        System.out.println("Please input 6 for DELETE EMPLOYEE BY ID");
        System.out.println("Please input 7 for ADD COMPANY");
        System.out.println("Please input 8 for PRINT ALL COMPANIES ");
        System.out.println("Please input 9 for SEARCH COMPANY BY ID");
        System.out.println("Please input 10 for PRINT EMPLOYEE BY COMPANY ID");
        System.out.println("Please input 11 for CHANGE EMPLOYEE COMPANY");
        System.out.println("Please input 12 for PRINT EMPLOYEE COMPANY");
    }

    private static void addEmployee() {
        System.out.println("Please input name,surname,employeeID,salary,company,position (with ,)");
        String s = scanner.nextLine();
        String[] split = s.split(",");
        Company company = companyStorage.getById(split[4]);
        Employee employee = new Employee(split[0], split[1], split[2], new Scanner(split[3]).nextDouble(), company, split[5]);
        employeeStorage.addEmployee(employee);


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
        String delByID = scanner.nextLine();
        employeeStorage.deleteById(delByID);
    }

    private static void searchEmployeeWithMinSalary() {
        System.out.println("Please input minimum salary");
        double minSalary = Double.parseDouble(scanner.nextLine());
        employeeStorage.searchByMinSalary(minSalary);

    }

}

