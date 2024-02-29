package org.example.purchase.domain;

import java.util.ArrayList;

public class GetPurchasesUseCase {

    private  PurchaseRepository purchaseRepository;

    public GetPurchasesUseCase(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    private ArrayList<Purchase> execute(){
        return this.purchaseRepository.obtainPurchases();
    }




}
