package cn.rocker.designpattern.command;


/**
 * @author rocker
 * @date 2019/09/21 15:16
 * @since V1.0
 */
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
