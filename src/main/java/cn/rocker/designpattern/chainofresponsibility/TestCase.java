package cn.rocker.designpattern.chainofresponsibility;

import org.junit.Test;

/**
 * @author rocker
 * @date 2019/09/01 21:24
 * @since V1.0
 */
public class TestCase {

    @Test
    public void test(){
        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();
        NameApprover nameApprover = new NameApprover();

        Course course = new Course();
        course.setArticle("Java 责任链模式 Article");
        course.setName("Java 责任链模式");
        course.setVideo("Java 责任链模式 Video");

        articleApprover.setNextApprover(videoApprover);
        videoApprover.setNextApprover(nameApprover);
        articleApprover.deploy(course);
    }

}
