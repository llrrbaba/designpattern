package cn.rocker.designpattern.builder.v2;

/**
 * @author rocker
 * @date 2019/08/25 20:40
 * @since V1.0
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    public Course(Coursebuilder coursebuilder) {
        this.courseName = coursebuilder.courseName;
        this.coursePPT = coursebuilder.coursePPT;
        this.courseVideo = coursebuilder.courseVideo;
        this.courseArticle = coursebuilder.courseArticle;
        this.courseQA = coursebuilder.courseQA;
    }

    public static class Coursebuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;

        public Coursebuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public Coursebuilder buildCoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }

        public Coursebuilder buildCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }

        public Coursebuilder buildCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }

        public Coursebuilder buildCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }

    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
