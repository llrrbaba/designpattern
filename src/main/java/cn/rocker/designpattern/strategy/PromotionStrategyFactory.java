package cn.rocker.designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂类，生成具体的策略
 *
 * @author rocker
 * @date 2019/09/01 10:51
 * @since V1.0
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION = new DefaultPromotionStrategy();

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String key) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(key);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    public interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
    }
}
