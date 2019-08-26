package cn.rocker.designpattern.builder.v1;

/**
 * @author rocker
 * @date 2019/08/25 21:04
 * @since V1.0
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPT,
                             String courseVideo, String courseArticle,
                             String courseQA){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
