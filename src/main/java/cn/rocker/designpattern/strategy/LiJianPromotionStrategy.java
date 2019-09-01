package cn.rocker.designpattern.strategy;

/**
 * 立减策略实现类
 *
 * @author rocker
 * @date 2019/08/31 21:30
 * @since V1.0
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销，购买商品均会减去一定金额");
    }
}
