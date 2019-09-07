package cn.rocker.designpattern.observer;

import java.util.Observable;

/**
 * 被观察者
 *
 * @author rocker
 * @date 2019/09/07 12:20
 * @since V1.0
 */
public class Course extends Observable {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println("在" + course.getName() + "课程有" + question.getUserName() + "提了问题");
        setChanged();
        notifyObservers(question);
    }
}
