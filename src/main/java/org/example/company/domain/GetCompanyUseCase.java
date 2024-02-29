package org.example.company.domain;

public class GetCompanyUseCase {

    private CompanyRepositoy companyRepositoy;

    public GetCompanyUseCase(CompanyRepositoy companyRepositoy) {
        this.companyRepositoy = companyRepositoy;
    }
    private Company execuet(String uniqueId){
        return this.companyRepositoy.obtainCompany(uniqueId);
    }
}
