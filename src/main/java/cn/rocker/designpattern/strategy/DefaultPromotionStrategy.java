package cn.rocker.designpattern.strategy;

/**
 * @author rocker
 * @date 2019/09/01 10:57
 * @since V1.0
 */
public class DefaultPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("默认促销，没有任何活动");
    }
}
