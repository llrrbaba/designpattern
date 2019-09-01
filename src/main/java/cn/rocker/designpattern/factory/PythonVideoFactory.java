package cn.rocker.designpattern.factory;

/**
 * @author rocker
 * @date 2019/09/01 20:34
 * @since V1.0
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
