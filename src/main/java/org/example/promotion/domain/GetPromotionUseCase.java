package org.example.promotion.domain;

public class GetPromotionUseCase {

    private  PromotionRepository promotionRepository;

    public GetPromotionUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    private Promotion execute(String uniqueId){
        return  this.promotionRepository.obtaiPromotion(uniqueId);
    }





}
