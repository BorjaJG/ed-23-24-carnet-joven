package org.example.promotion.domain;

import java.util.ArrayList;

public interface PromotionRepository {


    Promotion obtaiPromotion(String uniqueId);

    ArrayList<Promotion> obtaiPromotions();

    void savePromotion(Promotion promotion);

    void deletePromotio(String uniqueId);
}
