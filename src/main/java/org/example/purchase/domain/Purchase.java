package org.example.purchase.domain;

import org.example.promotion.domain.Promotion;
import org.example.user.domain.User;

import java.util.Date;

public class Purchase {

    private final String uniqueId;
    private final Date purchaseDate;
    private final Promotion promotion;
    private final User user;

    public Purchase(String uniqueId, Date purchaseDate, Promotion promotion, User user) {
        this.uniqueId = uniqueId;
        this.purchaseDate = purchaseDate;
        this.promotion = promotion;
        this.user = user;
    }

    // Getters
    public String getUniqueId() {
        return uniqueId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "uniqueId='" + uniqueId + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", promotion=" + promotion +
                ", user=" + user +
                '}';
    }
}
