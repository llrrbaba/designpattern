package cn.rocker.designpattern.observer.observerinspring;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 通过在某个方法上添加{@link EventListener}注解，可以指定该方法监听某个特定的事件
 *
 * @author rocker
 * @date 2019/09/08 20:35
 * @since V1.0
 */
@Component
public class MyApplicationEventListener {

    @EventListener
    public void listen(ApplicationContextEvent e){
        String property = e.getApplicationContext().getEnvironment().getProperty("event.property");
        System.out.println(property);
    }

}
