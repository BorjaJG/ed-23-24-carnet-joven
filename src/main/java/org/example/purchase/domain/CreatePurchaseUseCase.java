package org.example.purchase.domain;

public class CreatePurchaseUseCase {

    private PurchaseRepository purchaseRepository;

    public CreatePurchaseUseCase(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    private void execute(Purchase purchase){

        this.purchaseRepository.createPurchase(purchase);

    }


}
