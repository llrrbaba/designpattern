package cn.rocker.designpattern.templatemethod;

/**
 * @author rocker
 * @date 2019/09/01 22:41
 * @since V1.0
 */
public class FECourse extends AbstractCourse{
    @Override
    void packageCourse() {
        System.out.println("提供课程的前端源代码");
        System.out.println("提供课程的图片等多媒体素材");
    }
}
