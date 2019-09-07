package cn.rocker.designpattern.observer.observeringuava;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

/**
 * 测试类
 *
 * @author rocker
 * @date 2019/09/07 13:10
 * @since V1.0
 */
public class TestCase {

    @Test
    public void test(){
        EventBus eventBus = new EventBus();
        GuavaListener guavaListener = new GuavaListener();

        eventBus.register(guavaListener);
        eventBus.post("hello observer|listener|subscriber");
    }

}
