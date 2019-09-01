package cn.rocker.designpattern.simplefactory;

/**
 * @author rocker
 * @date 2019/09/01 12:20
 * @since V1.0
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("python 视频");
    }
}
