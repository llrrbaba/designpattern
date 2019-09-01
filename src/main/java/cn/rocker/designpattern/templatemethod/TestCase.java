package cn.rocker.designpattern.templatemethod;

import org.junit.Test;

/**
 * @author rocker
 * @date 2019/09/01 22:43
 * @since V1.0
 */
public class TestCase {
    @Test
    public void test(){
        AbstractCourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();

        AbstractCourse feCourse = new FECourse();
        feCourse.makeCourse();
    }
}
