package cn.rocker.designpattern.factory;

import org.junit.Test;

/**
 * @author rocker
 * @date 2019/09/01 12:23
 * @since V1.0
 */
public class TestCase {

    /**
     * 客户端代码非常依赖某个具体的实现类，来执行特定的代码，实现特定的功能
     */
    @Test
    public void test() {
        VideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();
    }

}
