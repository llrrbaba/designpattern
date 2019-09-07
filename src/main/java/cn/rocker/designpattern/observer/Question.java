package cn.rocker.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author rocker
 * @date 2019/09/07 12:32
 * @since V1.0
 */
public class Question {

    private String userName;
    private String questionContent;

    public Question(String userName, String questionContent) {
        this.userName = userName;
        this.questionContent = questionContent;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
