package cn.rocker.designpattern.builder.v2;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

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
        Course build = new Course.Coursebuilder().buildCourseName("Java设计模式-建造者")
                .buildCoursePPT("Java设计模式-建造者-PPT")
                .buildCourseArticle("Java设计模式-建造者-Article")
                .buildCourseVideo("Java设计模式-建造者-Video")
                .buildCourseQA("Java设计模式-建造者-QA")
                .build();
        System.out.println(build);
    }


    @Test
    public void testInGuava(){
        Set<String> build = ImmutableSet.<String>builder().add("a").add("b").add("c").build();
        System.out.println(build);
    }

}
