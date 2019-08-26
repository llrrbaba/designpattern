package cn.rocker.designpattern.builder.v1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author rocker
 * @date 2019/08/25 21:22
 * @since V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCase {

    @Test
    public void test(){
        CourseBuilder courseBuilder = new ActualCourseBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java建造者模式",
                "Java建造者模式PPT",
                "Java建造者模式Video",
                "Java建造者模式Article",
                "Java建造者模式QA");
        System.out.println(course);
    }

}
