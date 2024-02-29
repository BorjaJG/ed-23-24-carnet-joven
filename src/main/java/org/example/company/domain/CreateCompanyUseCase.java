package org.example.company.domain;

public class CreateCompanyUseCase {
    private CompanyRepositoy companyRepositoy;

    public CreateCompanyUseCase(CompanyRepositoy companyRepositoy) {
        this.companyRepositoy = companyRepositoy;
    }

    private  void execuet(Company company){

        this.companyRepositoy.createCompany(company);

    }


}
