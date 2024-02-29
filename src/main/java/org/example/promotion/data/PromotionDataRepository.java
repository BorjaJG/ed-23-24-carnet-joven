package org.example.promotion.data;

import org.example.promotion.domain.Promotion;
import org.example.promotion.domain.PromotionRepository;

import java.util.ArrayList;

public class PromotionDataRepository implements PromotionRepository {


    @Override
    public Promotion obtaiPromotion(String uniqueId) {
        return null;
    }

    @Override
    public ArrayList<Promotion> obtaiPromotions() {
        return null;
    }

    @Override
    public void savePromotion(Promotion promotion) {

    }

    @Override
    public void deletePromotio(String uniqueId) {

    }
}
