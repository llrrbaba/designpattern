package cn.rocker.designpattern.command;

/**
 * @author rocker
 * @date 2019/09/21 15:17
 * @since V1.0
 */
public class CloseCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
