package org.example.promotion.domain;

public class CreatePromotionUseCase {
    private PromotionRepository promotionRepository;

    public CreatePromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }
    private void  execuet(Promotion promotion){
        this.promotionRepository.savePromotion(promotion);
    }
}
