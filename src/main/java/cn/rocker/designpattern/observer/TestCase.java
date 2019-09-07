package cn.rocker.designpattern.observer;

import org.junit.Test;

/**
 * @author rocker
 * @date 2019/09/07 12:49
 * @since V1.0
 */
public class TestCase {

    @Test
    public void test(){
        Course course = new Course("Java设计模式");
        Teacher teacher1 = new Teacher("Mike");
        Teacher teacher2 = new Teacher("David");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        Question question = new Question("Danny", "面包圈去哪儿能买到？");

        course.produceQuestion(course, question);
    }

}
