package cn.rocker.designpattern.strategy;

import org.junit.Test;

import java.util.Objects;

/**
 * @author rocker
 * @date 2019/08/31 21:49
 * @since V1.0
 */
public class TestCase {

    /**
     * 客户端代码和具体的策略耦合了
     */
    @Test
    public void test1(){
        PromotionActivity promotionActivity1 = new PromotionActivity(new FanXianPromotionStrategy());
        PromotionActivity promotionActivity2 = new PromotionActivity(new LiJianPromotionStrategy());

        promotionActivity1.executePromotionStrategy();
        promotionActivity2.executePromotionStrategy();
    }

    /**
     * 客户端代码和具体的策略依然有耦合
     */
    @Test
    public void test2(){
        PromotionActivity promotionActivity = null;

        String promotionKey = "LIJIAN";
        if(Objects.equals(promotionKey, "LIJIAN")){
            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
        }else if(Objects.equals(promotionKey, "FANXIAN")){
            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
        }//...

        promotionActivity.executePromotionStrategy();
    }

    /**
     * 客户端只是根据调用方传来的{@code promotionKey}，
     * 通过工厂来获取具体的策略，而不会直接调用具体的策略，
     * 从而避免和具体的策略耦合
     */
    @Test
    public void test3(){
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }

}