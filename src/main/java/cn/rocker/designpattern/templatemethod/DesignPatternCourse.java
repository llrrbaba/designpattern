package cn.rocker.designpattern.templatemethod;

/**
 * @author rocker
 * @date 2019/09/01 22:40
 * @since V1.0
 */
public class DesignPatternCourse extends AbstractCourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needMakeArticle() {
        return true;
    }
}
