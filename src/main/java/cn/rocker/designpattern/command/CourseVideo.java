package cn.rocker.designpattern.command;

/**
 * @author rocker
 * @date 2019/09/21 15:14
 * @since V1.0
 */
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.printf("%s课程视频开放\n", this.name);
    }

    public void close(){
        System.out.printf("%s课程视频关闭\n", this.name);
    }

}
