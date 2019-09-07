package cn.rocker.designpattern.observer.observeringuava;

import com.google.common.eventbus.Subscribe;

/**
 * guava 中的事件 观察者|监听者|订阅者
 *
 * @author rocker
 * @date 2019/09/07 13:07
 * @since V1.0
 */
public class GuavaListener {

    @Subscribe
    public void listen1(String strEvcnt){
        System.out.println(strEvcnt);
    }

    @Subscribe
    public void listen2(String strEvcnt){
        System.out.println(strEvcnt);
    }

}
