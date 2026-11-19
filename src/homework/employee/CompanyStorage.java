package homework.employee;

public class CompanyStorage {
    private Company[] companies = new Company[10];
    private int size = 0;



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
    public void addCompany(Company company) {
        if (getById(company.getCompanyID()) != null) {
            System.out.println("Company with this ID already exists!");
            return;
        }
        if (size == companies.length) {
            extend();
        }
        companies[size++] = company;
        System.out.println("Company added!");
    }

    public Company getById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyID().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }


}
