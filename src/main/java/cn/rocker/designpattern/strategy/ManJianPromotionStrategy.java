package cn.rocker.designpattern.strategy;

/**
 * 满减策略实现类
 *
 * @author rocker
 * @date 2019/08/31 21:29
 * @since V1.0
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200，减20");
    }
}
