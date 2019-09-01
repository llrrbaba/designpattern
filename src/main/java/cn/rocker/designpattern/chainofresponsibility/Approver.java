package cn.rocker.designpattern.chainofresponsibility;

/**
 * @author rocker
 * @date 2019/09/01 21:12
 * @since V1.0
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
