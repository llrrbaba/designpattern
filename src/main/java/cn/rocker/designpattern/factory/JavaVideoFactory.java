package cn.rocker.designpattern.factory;

/**
 * @author rocker
 * @date 2019/09/01 20:32
 * @since V1.0
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
