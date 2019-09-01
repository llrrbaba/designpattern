package cn.rocker.designpattern.factory;

/**
 * @author rocker
 * @date 2019/09/01 12:20
 * @since V1.0
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("Java 视频");
    }
}
