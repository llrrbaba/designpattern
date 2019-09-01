package cn.rocker.designpattern.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * @author rocker
 * @date 2019/09/01 21:18
 * @since V1.0
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!StringUtils.isEmpty(course.getName())){
            System.out.printf("%s含有视频，批准",course.getName());
            System.out.println();
            if(approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.printf("%s不含有视频，不予批准，流程结束",course.getName());
            System.out.println();
        }
    }
}
