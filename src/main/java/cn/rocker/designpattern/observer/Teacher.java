package cn.rocker.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 *
 * @author rocker
 * @date 2019/09/07 12:35
 * @since V1.0
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "在" + course.getName()
                + "接收到" + question.getUserName() + "提交的" + question.getQuestionContent());
    }
}
