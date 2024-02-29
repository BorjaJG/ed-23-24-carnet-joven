package org.example.purchase.data;

import org.example.purchase.domain.Purchase;
import org.example.purchase.domain.PurchaseRepository;

import java.util.ArrayList;

public class PurchaseDataRepository implements PurchaseRepository {
    @Override
    public ArrayList<Purchase> obtainPurchases() {
        return null;
    }

    @Override
    public void createPurchase(Purchase purchase) {

    }
}
