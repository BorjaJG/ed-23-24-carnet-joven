package org.example.promotion.domain;

public class DeletePromotionUseCase {
    private  PromotionRepository promotionRepository;

    public DeletePromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }
    private  void  execiute(String uniqueId){

        this.promotionRepository.deletePromotio(uniqueId);

    }
}
