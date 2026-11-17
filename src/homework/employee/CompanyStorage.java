package homework.employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company c) {
        if (size == companies.length) {
            extend();
        }
        companies[size++] = c;
    }

    private void extend() {
        Company[] tmp = new Company[companies.length + 10];
        for (int i = 0; i < companies.length; i++) {
            tmp[i] = companies[i];
        }
        companies = tmp;
    }

    public void print() {
        if (size == 0) {
            System.out.println("No company found.");
            return;
        }
        for (int i = 0; i < size; i++) {

            System.out.print(companies[i] + " ");

        }
    }
    public void addCompany(Company company){
        for (int i = 0; i <size ; i++) {
            if (companies[i].getCompanyID().equals(company.getCompanyID())) {
                System.out.println("Company with this ID was already exsists!");
                return;
            }
        }
        companies[size++] = company;
    }
public void printAll(){
    for (int i = 0; i <size ; i++) {
        System.out.println(companies[i]+" ");
    }
}
    public Company getById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyID().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }
    private void searchComById(String ID) {
        boolean found = false;
        for (int i = 0; i <size ; i++) {
            if (companies[i].getCompanyID().equals(ID)){
                System.out.println(companies[i]+" ");
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Company with this ID not found");
        }
    }

}
