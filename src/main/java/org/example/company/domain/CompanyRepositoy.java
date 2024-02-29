package org.example.company.domain;

public interface CompanyRepositoy {
    Company obtainCompany(String uniqueId);

    void createCompany(Company company);
}
