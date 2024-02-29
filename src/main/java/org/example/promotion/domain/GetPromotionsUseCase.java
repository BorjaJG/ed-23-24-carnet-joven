package org.example.promotion.domain;

import java.util.ArrayList;

public class GetPromotionsUseCase {

    private  PromotionRepository promotionRepository;

    public GetPromotionsUseCase(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }
    private ArrayList<Promotion> execuete(){
        return promotionRepository.obtaiPromotions();
    }
}
