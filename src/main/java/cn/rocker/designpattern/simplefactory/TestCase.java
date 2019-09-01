package cn.rocker.designpattern.simplefactory;

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
        Video javaVideo = new JavaVideo();
        javaVideo.produce();

        Video pythonVideo = new PythonVideo();
        pythonVideo.produce();
    }


    @Test
    public void test2() {
        VideoFactory factory = new VideoFactory();
        Video java = factory.getVideoByType("java");
        if (java == null) {
            return;
        }
        java.produce();
    }


    @Test
    public void test3() {
        VideoFactory factory = new VideoFactory();
        Video java = factory.getVideoByReflect(JavaVideo.class);
        if (java == null) {
            return;
        }
        java.produce();
    }

}
