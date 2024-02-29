package org.example.purchase.domain;

import java.util.ArrayList;

public interface PurchaseRepository {


    ArrayList<Purchase> obtainPurchases();

    void createPurchase(Purchase purchase);
}
