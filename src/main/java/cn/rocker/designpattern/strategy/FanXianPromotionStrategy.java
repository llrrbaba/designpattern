package cn.rocker.designpattern.strategy;

/**
 * 返现策略实现类
 *
 * @author rocker
 * @date 2019/08/31 21:31
 * @since V1.0
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返现的金额存到用户的账户余额中");
    }
}
