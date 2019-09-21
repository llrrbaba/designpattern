package cn.rocker.designpattern.command;

import org.junit.Test;

/**
 * @author rocker
 * @date 2019/09/21 15:24
 * @since V1.0
 */
public class TestCase {

    @Test
    public void test(){
        CourseVideo courseVideo = new CourseVideo("Java命令模式");

        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);
        staff.executeCommands();
    }

}
