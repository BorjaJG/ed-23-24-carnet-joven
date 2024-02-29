package org.example.promotion.domain;

public class Promotion {

    private final String uniqueId;
    private final String title;
    private final String description;
    private final double discount;

    public Promotion(String uniqueId, String title, String description, double discount) {
        this.uniqueId = uniqueId;
        this.title = title;
        this.description = description;
        this.discount = discount;
    }


    public String getUniqueId() {
        return uniqueId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "uniqueId='" + uniqueId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", discount=" + discount +
                '}';
    }
}
