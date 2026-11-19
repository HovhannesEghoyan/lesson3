package homework.employee;

import java.util.Objects;

public class Company {
    private String companyID;
    private String name;
    private String industry;
    private String country;

    public Company(String companyID, String name, String industry, String country) {
        this.companyID = companyID;
        this.name = name;
        this.industry = industry;
        this.country = country;
    }

    public Company() {
    }


    @Override
    public String toString() {
        return "Company{" +
                "companyID='" + companyID + '\'' +
                ", name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getName() {
        return name;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(companyID, company.companyID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyID);
    }
        public String getCountry () {
            return country;
        }

        public void setCountry (String country){
            this.country = country;
        }

        public String getIndustry () {
            return industry;
        }

        public void setName (String name){
            this.name = name;
        }
    }

