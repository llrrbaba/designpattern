package cn.rocker.designpattern.strategy;

/**
 * @author rocker
 * @date 2019/08/31 21:37
 * @since V1.0
 */
public class PromotionActivity {

    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
