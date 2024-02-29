package org.example.company.domain;

public class Company {

    private final String uniqueId;
    private final String name;
    private final String cif;

    public Company(String uniqueId, String name, String cif) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.cif = cif;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public String getName() {
        return name;
    }

    public String getCif() {
        return cif;
    }

    @Override
    public String toString() {
        return "Company{" +
                "uniqueId='" + uniqueId + '\'' +
                ", name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                '}';
    }




}
